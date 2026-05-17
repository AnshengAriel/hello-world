package com.ariel.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ariel
 * @apiNote HelloController
 * @serial
 */
@RestController
public class HelloController {

    @GetMapping
    String hello() {
        return "Hello World";
    }
}
