package io.pivotal.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
    
}