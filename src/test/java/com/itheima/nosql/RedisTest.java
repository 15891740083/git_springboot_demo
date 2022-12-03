package com.itheima.nosql;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

/**
 * @author yutong
 * @Description
 * @date 2022年12月02日 16:09
 */
@SpringBootTest
public class RedisTest {
    //默认<object,object>存的key是对象，不是字符串
    @Resource
    private RedisTemplate redisTemplate;


    //默认<string,object>存的key和value都是字符串
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    ValueOperations vo;

    @BeforeEach
    void contextLoads(){
        vo = stringRedisTemplate.opsForValue();
        System.out.println("开始");
    }
    @AfterEach
    void close(){
        if(vo!=null){
            System.out.println("结束");
        }
    }
    @Test
    void testGet(){
        System.out.println(vo.get("name"));
        System.out.println(vo.get("age"));
    }
    @Test
    void testSet(){
        vo.set("name","张三");
        vo.set("age","30");
    }




}
