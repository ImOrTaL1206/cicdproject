package com.example.cicdproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "CI/CD Project executed Successfully";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}