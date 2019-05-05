package com.example.online_retailers_zull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class OnlineRetailersZullApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineRetailersZullApplication.class, args);
    }

}
