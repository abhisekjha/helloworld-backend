package com.example.helloworldbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "Hello from your custom Spring Boot backend!\n and this is a change";
    }
}
