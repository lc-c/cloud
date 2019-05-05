package com.example.zipkin.ctrl;


import com.example.zipkin.openfeign.OpenFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexCtrl {

    @Autowired
    OpenFeign openFeign;

    @GetMapping("/home")
    public void index() {
        openFeign.hello();
    }

    @GetMapping("/test")
    public String test() {
        return openFeign.test();
    }
}
