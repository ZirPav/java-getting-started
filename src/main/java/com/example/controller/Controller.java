package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/sayHello")
    public String getHello(@RequestParam String name) {
        return "Hello, " + name;
    }

    @GetMapping("/sayGo")
    public String getGo(@RequestParam String go) {
        return "Hello, " + go;
    }
}
