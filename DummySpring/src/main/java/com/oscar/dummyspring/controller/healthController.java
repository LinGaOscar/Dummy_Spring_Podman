package com.oscar.dummyspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/api")
public class healthController {
    @GetMapping("/health")
    public Map hello(){
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("result","check");
        return resultMap;
    }
}
