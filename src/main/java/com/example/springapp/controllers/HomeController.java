package com.example.springapp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "home";
    }
    @GetMapping("/medicine")
    public String medicine(){
        return "medicine";
    }
    @GetMapping("/health")
    public String health(){
        return "health";
    }
    @GetMapping("/news")
    public String news(){
        return "news";
    }
    @GetMapping("/client")
    public String client(){
        return "client";
    }
    @GetMapping("/contactUs")
    public String contact(){
        return "contact";
    }
}
