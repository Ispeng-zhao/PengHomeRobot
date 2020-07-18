package com.robot.service.redis.service;

public interface RedisService {
    /**
     *
     * @param key
     * @param value
     * @param seconds 超时时间
     */
    public void set(String key, Object value, long seconds);
    public Object get(String key);
}