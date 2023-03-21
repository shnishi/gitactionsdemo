package com._40dev.githubactionsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
    @GetMapping("/api/hello")
    public String hello() {
        return "Hello";
    }
}
