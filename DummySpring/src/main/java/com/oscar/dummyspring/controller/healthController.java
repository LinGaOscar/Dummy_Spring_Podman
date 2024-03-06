package com.oscar.dummyspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller("/api")
public class healthController {
    @GetMapping("/health")
    public Map hello(){
        Map<String,Object> resultMap = new HashMap<>();
        return resultMap;
    }
}
