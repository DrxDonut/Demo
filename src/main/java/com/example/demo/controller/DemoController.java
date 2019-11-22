package com.example.demo.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequiredArgsConstructor
public class DemoController {
    @GetMapping(value = "testwithget")
    public String determineIfRunningWithGet() {
        return "hello with a GET\n";
    }

    @GetMapping(value = "oogabooga")
    public String whyNot(){
        return "trying this one now";
    }
}
