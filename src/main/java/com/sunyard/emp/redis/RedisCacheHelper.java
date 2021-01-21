package com.sunyard.emp.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@Component
public class RedisCacheHelper implements RedisCacheManager {

    @Autowired
    private RedisTemplate stringRedisTemplate;

    @Override
    public RedisTemplate getRedis() {
        return stringRedisTemplate;
    }

    @Override
    public void set(Object key, Object value) {
        getRedis().opsForValue().set(key, value);
    }

    @Override
    public void setAndExpire(Object key, Object value, int expire) {
        set(key, value);
        expire(key, expire);
    }

    @Override
    public Object get(Object key) {
        return getRedis().opsForValue().get(key);
    }

    @Override
    public boolean expire(Object key, int seconds) {
        return getRedis().expire(key, seconds, TimeUnit.SECONDS);
    }

    @Override
    public long increment(Object key, long num) {
        return getRedis().opsForValue().increment(key, num);
    }

    @Override
    public long increment(Object key) {
        return  getRedis().opsForValue().increment(key);
    }

    @Override
    public boolean del(Object key) {
        return getRedis().delete(key);
    }

    @Override
    public boolean setnx(Object key, Object value) {
        return getRedis().opsForValue().setIfAbsent(key, value);
    }

    @Override
    public long ttl(Object key) {
        return getRedis().getExpire(key);
    }

    @Override
    public Set<Object> keys(Object pattern) {
        if (IGNORE_REGEX.equals(pattern)) {
            return null;
        }
        return getRedis().keys(pattern);
    }

    @Override
    public Object getAndSet(Object key, Object value) {
        return getRedis().opsForValue().getAndSet(key, value);
    }

    @Override
    public void hashMapSet(Object key, Map value) {
        getRedis().opsForHash().putAll(key, value);
    }

    @Override
    public Object hashMapGet(Object key, Object realKey) {
        return getRedis().opsForHash().get(key, realKey);
    }

}
