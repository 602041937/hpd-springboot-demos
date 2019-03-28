package com.hpd.hpdspringbootdemos;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.jms.Queue;
import javax.jms.Topic;

@SpringBootApplication
//@EnableScheduling
//@Enab leAsync //开启异步任务
//@EnableJms
public class HpdSpringbootDemosApplication {

    @Bean //交给spring进行管理，方便后续进行注入
    public Queue queue() {
        //点对点模型
        return new ActiveMQQueue("hpd_test_queue");
    }

    @Bean
    public Topic topic() {
        //订阅模型
        return new ActiveMQTopic("hpd_test_topic");
    }

    public static void main(String[] args) {
        SpringApplication.run(HpdSpringbootDemosApplication.class, args);
    }

}
