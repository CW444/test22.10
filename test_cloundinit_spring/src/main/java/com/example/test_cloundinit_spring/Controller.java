package com.example.test_cloundinit_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public void index() {
        System.out.println("index");
    }

}
