package com.masiv.test;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class  HolaMundo{

    @RequestMapping("/")
    public String hola(){
        return "hola mundo";
    }
}