package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     : wzt.
 * @ Date       : Created in 14:51 2019/7/8
 * @ Description: spring boot hello world
 * @ Modified By:
 * @ Version    : 1.0$
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
