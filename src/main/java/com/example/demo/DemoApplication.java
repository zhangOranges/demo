package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    private String patch = "master_patch";

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
