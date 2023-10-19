package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    private String dev= "dev programmer3";
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
