package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Hello;

@RestController
public class HelloController {

    @GetMapping("/")
    public Hello home() {
        return new Hello();
    }
}