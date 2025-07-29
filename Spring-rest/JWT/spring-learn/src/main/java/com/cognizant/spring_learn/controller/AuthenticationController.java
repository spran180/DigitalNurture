package com.cognizant.spring_learn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    public static Logger log = LoggerFactory.getLogger(AuthenticationController.class);
    @GetMapping("/authenticate")
    public Map<String, String> authentication(@RequestHeader("Authorization") String authHeader) {
        log.info("Controller Start");

        HashMap<String, String> map = new HashMap<>();
        map.put("token", "");
    }
}
