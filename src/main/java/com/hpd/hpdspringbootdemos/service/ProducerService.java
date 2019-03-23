package com.hpd.hpdspringbootdemos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;


import javax.jms.Queue;
import javax.jms.Topic;

@Service
public class ProducerService {

    @Autowired
    private JmsMessagingTemplate template;

    @Autowired
    private Queue queue;

    @Autowired
    private Topic topic;

    //点对点
    public void sendMessage(String message) {
        template.convertAndSend(this.queue, message);
    }

    //监听队列消息
    @JmsListener(destination = "hpd_test_queue")
    public void receiveMessage(String text) {
        System.out.println("收到的消息=" + text);
    }

    //发布订阅
    public void sendPubSubMessage(String message) {
        template.convertAndSend(this.topic, message);
    }

    //监听队列消息
    @JmsListener(destination = "hpd_test_topic")
    public void receiveMessage1(String text) {
        System.out.println("收到的发布订阅消息=" + text);
    }
}
