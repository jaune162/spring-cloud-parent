package com.codestd.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosBookServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosBookServiceApplication.class, args);
    }

}
