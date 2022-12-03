package com.itheima.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author yutong
 * @Description 定时器实体类
 * @date 2022年12月03日 17:31
 */
@Component
public class TaskBen {

    @Scheduled(cron = "0/10 * * * * ?")//秒 分 时 天 月 星期
    public void  print(){
        System.out.println("定时器执行-------");
    }

}
