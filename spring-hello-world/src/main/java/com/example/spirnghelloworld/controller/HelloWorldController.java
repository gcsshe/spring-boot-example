package com.example.spirnghelloworld.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bingo
 */
@RestController
public class HelloWorldController {
    @Value("${controllerName}")
    String controllerName;
    Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
    @RequestMapping(value = "/helloWorld",produces = "application/json")
    public String helloWorld() {
        System.out.println(controllerName);
        logger.debug("测试打印日志");
        return "Hello World";
    }
}
