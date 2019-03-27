package com.example.demo;

import io.netty.buffer.ByteBuf;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "test")
public class TestController {

    @RequestMapping(value = "getInfo")
    public void getInfo()
    {

    }
}
