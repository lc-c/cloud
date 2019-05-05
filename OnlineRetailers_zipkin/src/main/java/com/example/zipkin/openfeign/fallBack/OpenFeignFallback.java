package com.example.zipkin.openfeign.fallBack;

import com.example.zipkin.openfeign.OpenFeign;

public class OpenFeignFallback implements OpenFeign {
    @Override
    public String hello() {
        return null;
    }

    @Override
    public String test() {
        return null;
    }
}
