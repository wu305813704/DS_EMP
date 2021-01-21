package com.sunyard.emp.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStringCommands;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.data.redis.core.types.Expiration;
import org.springframework.util.StringUtils;

import java.util.Collections;


@Configuration
public class RedisUtils {

    private static RedisCacheManager cacheManager;
    /**
     * 锁的默认超时时间1小时
     */
    private static final long LOCK_DEFAULT_TIME_OUT = 1000 * 60 * 60;
    /**
     * redis锁的key的前缀
     */
    public static final String LOCK_KEY_PREFIX = "LOCK:";

    /**
     * @param key   锁的Key(业务数据)
     * @param value 锁里面的值(uuid,即解锁的值)
     */
    public static boolean tryLock(final String key, final String value) {
        return tryLock(key, value, LOCK_DEFAULT_TIME_OUT);
    }

    /**
     * @param key     锁的Key(业务数据)
     * @param value   锁里面的值(uuid,即解锁的值)
     * @param timeout 超时时间（毫秒）
     */
    public static boolean tryLock(final String key, final String value, final long timeout) {
        if (StringUtils.isEmpty(key)) {
            throw new IllegalArgumentException("key不能为空");
        }
        RedisCallback<Boolean> redisCallback = (connection) -> {
            RedisStringCommands redisStringCommands = connection.stringCommands();
            // 执行加强了的set命令，返回true代表设置成功
            return redisStringCommands.set(key.getBytes(), value.getBytes(), Expiration.milliseconds(timeout), RedisStringCommands.SetOption.SET_IF_ABSENT);
        };
        Boolean result = (Boolean) getStringCache().getRedis().execute(redisCallback);
        return result != null && result;
    }

    @SuppressWarnings("unchecked")
    public static boolean releaseLock(String key, String value) {
        // lua 脚本
        String script = "if redis.call('get', KEYS[1]) == ARGV[1] then return redis.call('del', KEYS[1]) else return 0 end";
        Long result = (Long) getStringCache().getRedis().execute(new DefaultRedisScript<>(script, Long.class), Collections.singletonList(key), value);
        return result != null && result == 1;
    }


    public static String saveDraft(String token, String businessKey, String taskName, String value) {
        String redisKey = token.concat(":").concat(businessKey).concat(":").concat(taskName);
        RedisCacheManager redisCacheManager = getStringCache();
        redisCacheManager.set(redisKey, value);
        return null;
    }

    public static String getDraft(String token, String businessKey, String taskName) {
        String redisKey = token.concat(":").concat(businessKey).concat(":").concat(taskName);
        String selectValue = (String) getStringCache().get(redisKey);
        return selectValue;
    }

    public static Boolean delDraft(String token, String businessKey, String taskName) {
        String redisKey = token.concat(":").concat(businessKey);
        if (null != taskName) {
            redisKey = redisKey.concat(":").concat(taskName);
        }
        RedisCacheManager redisCacheManager = getStringCache();
        boolean del = redisCacheManager.del(redisKey);
        return del;
    }

    @Bean
    public RedisCacheManager setStringCacheManager() {
        cacheManager = getStringCache();
        return cacheManager;
    }

    public static RedisCacheManager getStringCache() {
        if (cacheManager == null) {
            cacheManager = new RedisCacheHelper();
        }
        return cacheManager;
    }

}
