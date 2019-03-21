package com.hpd.hpdspringbootdemos.schedules;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

//异步任务类
@Component
public class AsyncTask {

    @Async //如果申明在方法上，就说明这个方法是异步的。如果在类上，说明这个类中的方法都是异步的
    public void test() {
        System.out.println("异步任务");
    }
}
