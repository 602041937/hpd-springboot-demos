package com.hpd.hpdspringbootdemos.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User2 {

    @Value("hpd")
    private String name;
    @Value("1")
    private int age;
}
