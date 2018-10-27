package com.lian.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(){
        return "helel--dddd--";

    }
    @RequestMapping("/get")
    public String get(){
        return "ddhd";
    }
}
