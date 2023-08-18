package com.example.redisDemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;


@SpringBootTest
class RedisDemoApplicationTests {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    void contextLoads() {
//        System.out.println(redisTemplate.opsForZSet().score("USER_HONOR_TITLE_1472806734392336384","{\"id\":167,\"level\":23,\"type\":13}"));
//        System.out.println(redisTemplate.delete("USER_HONOR_TITLE_1472806734392336384"));
        System.out.println(redisTemplate.opsForHash().get("WAL:USER_BALANCE_MICO_1472827092600233984", "arrearsBalance"));
        System.out.println(redisTemplate.opsForHash().get("WAL:USER_BALANCE_MICO_1472827092600233984", "balance"));
        System.out.println(redisTemplate.opsForHash().get("WAL:USER_BALANCE_MICO_1472827092600233984", "currency"));
        System.out.println(redisTemplate.hasKey("uid_info_832628563564666881"));
        System.out.println(redisTemplate.opsForSet().members("MEDAL_NEW_1634078647021342720"));
        redisTemplate.boundSetOps("MEDAL_NEW_1634078647021342721");
    }


}
