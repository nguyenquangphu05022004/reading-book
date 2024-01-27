package com.example.metruyenchu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {

    @GetMapping("/hello-world")
    public String greater() {
        return "Hello Word";
    }
}
