package com.itheima.task;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author yutong
 * @Description  定时器测试
 * @date 2022年12月03日 17:17
 */
public class TaskTest {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("定时任务执行");
            }
        };
        timer.schedule(task,0,2000);
    }
}
