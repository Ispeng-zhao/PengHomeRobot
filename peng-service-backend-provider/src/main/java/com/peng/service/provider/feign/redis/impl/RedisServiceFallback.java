package com.peng.service.provider.feign.redis.impl;


import com.peng.service.provider.feign.redis.RedisService;

public class RedisServiceFallback implements RedisService {
    @Override
    public String put(String key, String value, long seconds) {
        return null;
    }

    @Override
    public String get(String key) {
        return null;
    }
}
