package me.cyansong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController{
    @RequestMapping("/")
    public String index(){
        return "Greeting from Spring Boot!";
    }
}