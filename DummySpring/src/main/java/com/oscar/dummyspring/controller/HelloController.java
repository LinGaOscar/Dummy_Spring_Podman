package com.oscar.dummyspring.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public Map<String, Object> getHealth() {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "say hello");
        return result;
    }
    @GetMapping("/echo")
    public Map<String, Object> getEcho(@RequestParam String message) {
        Map<String, Object> result = new HashMap<>();
        result.put("message", message);
        return result;
    }
}
