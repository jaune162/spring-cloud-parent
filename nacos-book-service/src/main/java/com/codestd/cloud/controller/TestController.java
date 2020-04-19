/*
 * Copyright © 2018-2020 CODESTD.COM Inc. All rights reserved.
 */

package com.codestd.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author jaune
 * @since 1.0.0
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "OK";
    }
}
