package com.springys.Common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by yzd on 2019/2/13.
 */
@Component
public class RedisUtils {
    @Autowired
    private  StringRedisTemplate stringRedisTemplate;
    public  void creatRedis(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }
    public  String requestValue(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }
}
