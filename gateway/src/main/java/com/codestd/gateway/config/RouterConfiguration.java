/*
 * Copyright © 2018 CODESTD.COM Inc. All rights reserved.
 */
package com.codestd.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 路由配置
 *
 * @author jaune
 * @since 1.0.0
 */
@Configuration
public class RouterConfiguration {

    //@Bean
    public RouteLocator myRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("myapi", r -> r.path("/**")
                        .uri("lb://CONSUL-CLIENT-SIDE"))
                .route("path_route", r -> r.path("/get")
                        .uri("http://httpbin.org"))
                .build();
    }
}
