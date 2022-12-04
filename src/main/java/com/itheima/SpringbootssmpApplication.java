package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableCaching// 开启缓存功能
@SpringBootApplication
@EnableScheduling// 开启定时任务开关
public class SpringbootssmpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootssmpApplication.class, args);
    }

}
