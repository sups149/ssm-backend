package com.spnd.aws.ssm.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("v1/customer")
public class CommonController {
    @Value("${user.message}")
    private String msg;

    @GetMapping("/greeting/{name}")
    public String getGreetingMessage(@PathVariable("name") String name) {
        return msg+", "+name;
    }
}
