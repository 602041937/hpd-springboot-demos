package com.hpd.hpdspringbootdemos.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanController {

    @Autowired
    private User user;

    @GetMapping(value = "/bean/test")
    public Object test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user1 = (User) context.getBean(User.class);
        User user2 = (User) context.getBean(User.class);
//        boolean user1 = context.isSingleton("user");
        return user.toString() + user2.toString();
    }

    @GetMapping(value = "/bean/test2")
    public Object test2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);
        User2 user = (User2) context.getBean(User2.class);
        return user.toString();
    }
}
