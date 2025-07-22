package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    Logger log = LoggerFactory.getLogger("HomeController.class");

    @GetMapping("/hello")
    public String sayHello(){
        log.info("START");
        log.info("END");
        return "Hello World !!";
    }
}
