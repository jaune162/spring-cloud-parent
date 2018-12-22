/*
 * Copyright © 2018 CODESTD.COM Inc. All rights reserved.
 */
package com.codestd.gateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.net.URI;

import static org.springframework.cloud.gateway.support.ServerWebExchangeUtils.GATEWAY_REQUEST_URL_ATTR;

/**
 * 权限验证
 *
 * @author jaune
 * @since 1.0.0
 */
// @Component
public class AuthedFilter implements GlobalFilter {

    private static Logger logger = LoggerFactory.getLogger(AuthedFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        logger.info("authed filter");
        URI requestUrl = exchange.getRequiredAttribute(GATEWAY_REQUEST_URL_ATTR);

        if (!this.isAuthenticated(exchange.getRequest())) {
            ServerHttpResponse response = exchange.getResponse();
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            return response.setComplete();
        } else {
            return chain.filter(exchange);
        }
    }

    private boolean isAuthenticated(ServerHttpRequest request) {
        String token = request.getHeaders().getFirst("Authenticated");
        return token != null;
    }
}
