package com.hpd.hpdspringbootdemos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HpdSpringbootDemosApplication {

    public static void main(String[] args) {
        SpringApplication.run(HpdSpringbootDemosApplication.class, args);
    }

}
