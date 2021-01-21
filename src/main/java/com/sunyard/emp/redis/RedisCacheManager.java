package com.sunyard.emp.redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.support.atomic.RedisAtomicLong;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface RedisCacheManager {

    int DEFAULT_EXPIRE = 60 * 60 * 24;
    String IGNORE_REGEX = "*";

    void set(Object key, Object value);

    void setAndExpire(Object key, Object value, int expire);

    Object get(Object key);

    boolean expire(Object key, int seconds);

    long increment(Object key, long num);

    long increment(Object key);

    boolean del(Object key);

    boolean setnx(Object key, Object value);

    long ttl(Object key);

    Set<Object> keys(Object pattern);

    Object getAndSet(Object key, Object value);

    void hashMapSet(Object key, Map value);

    Object hashMapGet(Object key, Object realKey);

    default long getRedisSequence(){
        RedisAtomicLong redisAtomicLong = new RedisAtomicLong("GlobalSerialNo", getRedis().getConnectionFactory());
        long sequence = 0L;
        try {
            if (redisAtomicLong.get() == 0) {
                redisAtomicLong.getAndSet(0L);
            }
            sequence = redisAtomicLong.incrementAndGet();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return sequence;
    }

    RedisTemplate getRedis();

    default long leftPush(Object key, Object value) {
        return getRedis().opsForList().leftPush(key, value);
    }

    default List<Object> rightPopAll(Object key) {
        Long size = getRedis().opsForList().size(key);
        List<Object> list = new ArrayList<>();
        for (long i = 0; i < size; i++) {
            list.add(getRedis().opsForList().rightPop(key));
        }
        return list;
    }

}
