package com.hpd.hpdspringbootdemos.Controller;

import com.hpd.hpdspringbootdemos.bean.AppConfig;
import com.hpd.hpdspringbootdemos.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class TestController {

    @Autowired
    private User user;

    @GetMapping(value = "/test")
    public Object test() {
//        HashMap<String, Object> map = new HashMap<String, Object>();
//        map.put("name", "hpd");
//        map.put("age", 12);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user1 = (User) context.getBean(User.class);
        User user2 = (User) context.getBean("user");
        return user.toString() + user2.toString();
    }
}
