package com.hpd.hpdspringbootdemos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;


import javax.jms.Queue;

@Service
public class ProducerService {

    @Autowired
    private JmsMessagingTemplate template;

    @Autowired
    private Queue queue;

    public void sendMessage(String message) {
        template.convertAndSend(this.queue, message);
    }

    //监听队列消息
    @JmsListener(destination = "hpd_test_queue")
    public void receiveMessage(String text) {
        System.out.println("收到的消息=" + text);
    }
}
