/*
 * Copyright © 2018 CODESTD.COM Inc. All rights reserved.
 */
package com.codestd.consul.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jaune
 * @since 1.0.0
 */
@RestController
@RequestMapping("/authed")
public class AuthedController {

    @GetMapping("/role")
    public String authedMethod() {

        return "You get the role";
    }

}
