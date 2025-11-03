package org.uasz.springboot_example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping
    public Object hello() {
        Map<String, String> object = new HashMap<>();
        object.put("name", "Integration Ninjas");
        object.put("email", "integrationninjas@gmail.com");
        return object;
    }
}
