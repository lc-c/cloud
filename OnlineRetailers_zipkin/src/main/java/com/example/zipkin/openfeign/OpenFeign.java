package com.example.zipkin.openfeign;

import com.example.zipkin.openfeign.fallBack.OpenFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(value = "serverA",fallback = OpenFeignFallback.class)
public interface OpenFeign {

    @RequestMapping(value = "/", method = GET)
    String hello();

    @GetMapping("/test")
    String test();

}
