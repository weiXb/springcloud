package com.example.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DCcontroller {
    @Autowired
    DiscoveryClient discoveryClient;
    @Value("${url}")
    private String url;
    @Value("${localurl}")
    private String localurl;

    @GetMapping("/dc")
    public String dc() {
        String services = "Services1: " + url + localurl + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
