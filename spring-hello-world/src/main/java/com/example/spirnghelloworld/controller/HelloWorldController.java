package com.example.spirnghelloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bingo
 */
@RestController
public class HelloWorldController {
    @RequestMapping(value = "/helloWorld",produces = "application/json")
    public String helloWorld() {

        return "Hello World";
    }
}
