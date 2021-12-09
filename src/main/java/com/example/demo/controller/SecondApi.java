package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondApi {

    @RequestMapping(value = "/secondApi", method = RequestMethod.GET)
    public String secondApi (){
        return "hello from second API";
    }
}
