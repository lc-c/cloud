package com.example.server_a.ctrl;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexCtrl {

    @GetMapping("/")
    public String home(){
        return "Hello";
    }


    @GetMapping("/test")
    public String test(){
        return "Test";
    }
}
