package com.yeswanth.helloProject.MyFirstHelloWorldProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/Hello")
    public String getHello(){
        return "hello World";
    }
}
