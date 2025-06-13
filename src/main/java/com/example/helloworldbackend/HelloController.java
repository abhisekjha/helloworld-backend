package com.example.helloworldbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Day 2! completed and and it is working fine at ! " + LocalDateTime.now();
    }

}
