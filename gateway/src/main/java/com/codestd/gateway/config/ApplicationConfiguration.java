/*
 * Copyright © 2018 CODESTD.COM Inc. All rights reserved.
 */
package com.codestd.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.http.codec.support.DefaultServerCodecConfigurer;

/**
 * @author jaune
 * @since 1.0.0
 */
@Configuration
public class ApplicationConfiguration {

    //@Bean
    public ServerCodecConfigurer serverCodecConfigurer() {
        return new DefaultServerCodecConfigurer();
    }
}
