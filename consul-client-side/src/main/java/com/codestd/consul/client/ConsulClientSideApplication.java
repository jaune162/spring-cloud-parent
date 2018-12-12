package com.codestd.consul.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulClientSideApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulClientSideApplication.class, args);
    }
}
