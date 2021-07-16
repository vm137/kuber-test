package com.epam.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "Root address queried.";
    }

    @RequestMapping("/hello")
    public String greeting() {
        return "Hello Kubernetes!";
    }
}
