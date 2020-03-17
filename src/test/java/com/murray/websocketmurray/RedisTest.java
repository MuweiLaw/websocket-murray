//package com.murray.websocketmurray;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.test.context.junit4.SpringRunner;
//
///**
// * @Description:
// * @author: Murray Law
// * @Date:2020/3/9 15:49
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class RedisTest {
//
//        @Autowired
//        private RedisTemplate<String,String> redisTemplate;
//
//        @Test
//        public void set(){
//            redisTemplate.opsForValue().set("myKey","myValue");
//            System.out.println(redisTemplate.opsForValue().get("myKey"));
//        }
//    }
