package me.cyansong.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mvc")
public class GreetController{

    @RequestMapping
    public String index(){
        return "Greeting from Spring Boot!";
    }

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public String hello(@PathVariable("id")String id){
        System.out.println(id);
        return id;
    }
}
