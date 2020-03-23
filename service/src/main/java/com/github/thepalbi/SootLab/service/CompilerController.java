package com.github.thepalbi.SootLab.service;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class CompilerController {

    @RequestMapping("/health")
    String healthcheck() {
        return "OK";
    }
}
