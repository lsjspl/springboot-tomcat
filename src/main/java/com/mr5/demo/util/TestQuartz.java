package com.mr5.demo.util;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestQuartz {

    //    每分钟启动
    @Scheduled(fixedDelay = 1000*60)
    public void timerToNow(){
        System.out.println("测试定时任务");
    }
}
