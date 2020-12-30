package com.ssh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ssh
 * @description
 * @date 2020/12/30 9:53
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello docker!";
    }
}
