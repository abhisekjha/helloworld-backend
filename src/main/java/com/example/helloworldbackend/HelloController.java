package com.example.helloworldbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello from your custom Spring Boot backend and Docker and Time stamp is ! " + LocalDateTime.now();
    }

}
