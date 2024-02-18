package com.jyujyu.review.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestApi {
    @GetMapping("/hello/world")
    public String HelloWorld() {
        return "[Get] Hello, world!";
    }

    @PostMapping("/hello/world")
    public String PostHelloWorld() {
        return "[Post] Hello, world!";
    }

    @PutMapping("/hello/world")
    public String PutHelloWorld() {
        return "[Put] Hello, world!";
    }

    @DeleteMapping("/hello/world")
    public String DeleteHelloWorld() {
        return "[Delete] Hello, world!";
    }
}
