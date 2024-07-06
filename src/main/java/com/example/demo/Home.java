package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home{

    @GetMapping({"/home","/status"})
    public String getStatus(){
        return "Application is running";
    }
}
