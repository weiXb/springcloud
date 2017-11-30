package com.example.eurekaconsumer.service;

import org.springframework.stereotype.Component;

@Component
public class DcClientHystrix implements DcClient {
    @Override
    public String consumer() {
        return "这是熔断";
    }
}
