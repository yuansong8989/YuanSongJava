package com.springys.Common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;

/**
 * Created by yzd on 2019/2/15.
 */
@Slf4j
@Component
public class Md5PR {
    //获取用户传入的用户
    @Autowired
private  StringRedisTemplate stringRedisTemplate1;
    public  boolean RequestUserName(String username, Map<Object, Object> map) {
        Set<Object> set = map.keySet();
        Map<Object,Object> map1=stringRedisTemplate1.opsForHash().entries("users");
        Set<Object> set1=map1.keySet();
        for (Object str1 : set1){
            log.info("输出:"+str1);
        }
        int a = 0;
        log.info("这儿");
        for (Object str : set) {
            log.info("用户有：" + str);
            if (str.equals(username)) {
                a = 1;
                break;
            }
        }
        if (a == 1) {
            return true;
        } else {
            return false;
        }
    }
}
