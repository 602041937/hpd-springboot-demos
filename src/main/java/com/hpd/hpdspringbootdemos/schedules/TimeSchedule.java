package com.hpd.hpdspringbootdemos.schedules;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class TimeSchedule {

    @Scheduled(fixedRate = 2000)
    public void work() {
        System.out.println("当前时间=" + new Date().toString());
    }
}
