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
        hashMap.put("test", "test");

        return hashMap;
    }

    @GetMapping("/login")
    public HashMap<String, String> login () {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("id", "1");
        hashMap.put("name", "zx");
        hashMap.put("age", "18");
        hashMap.put("login", "login");

        return hashMap;
    }

    @GetMapping("/logout")
    public HashMap<String, String> logout () {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("id", "1");
        hashMap.put("name", "zx");
        hashMap.put("age", "18");
        hashMap.put("logout", "logout");

        return hashMap;
    }

    @GetMapping("/xx")
    public HashMap<String, String> xx () {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("id", "1");
        hashMap.put("name", "zx");
        hashMap.put("age", "18");
        hashMap.put("xx", "xx");
        hashMap.put("xx1", "11");

        return hashMap;
    }
}
