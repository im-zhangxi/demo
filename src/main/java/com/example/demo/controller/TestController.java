package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class TestController {

    @GetMapping("/test")
    public HashMap<String, String> hello () {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "zx");
        hashMap.put("age", "18");

        return hashMap;
    }
}
