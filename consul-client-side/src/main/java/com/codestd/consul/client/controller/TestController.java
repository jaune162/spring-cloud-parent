/*
 * Copyright © 2018 CODESTD.COM Inc. All rights reserved.
 */
package com.codestd.consul.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 * @author jaune
 * @since 1.0.0
 */
@RestController
public class TestController {

    @GetMapping("/test/{name}")
    public String test(@PathVariable String name) {

        return "Hello " + name;
    }
}
