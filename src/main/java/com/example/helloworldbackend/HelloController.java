package com.example.helloworldbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello from your custom Spring Boot backend and Docker!";
    }

//    @GetMapping("/secret")
//    public String getSecret() {
//        String password = System.getenv("DB_PASSWORD");
//        return "Secret loaded: " + (password != null ? "✅Yes" : "❌No");
    }
}
