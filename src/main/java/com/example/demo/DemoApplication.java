package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    private String dev= "dev programmer4";

    private static String patch_file = "out";
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println(patch_file);
    }

}
