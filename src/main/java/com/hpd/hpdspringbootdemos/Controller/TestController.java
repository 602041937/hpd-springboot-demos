package com.hpd.hpdspringbootdemos.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class TestController {

    @GetMapping(value = "/test")
    public Object test() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "hpd");
        map.put("age", 12);
        return map;
    }
}
