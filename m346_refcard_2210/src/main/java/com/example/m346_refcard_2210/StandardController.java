package com.example.m346_refcard_2210;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StandardController {

    @GetMapping("/")
    public String index() {
        return "haupt.html";
    }
}
