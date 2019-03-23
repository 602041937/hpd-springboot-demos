package com.hpd.hpdspringbootdemos.Controller;

import com.hpd.hpdspringbootdemos.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activemq")
public class ActivemqController {

    @Autowired
    private ProducerService producerService;

    @GetMapping("send")
    public Object send(String message) {
        producerService.sendMessage(message);
        return "{code: 0}";
    }
}
