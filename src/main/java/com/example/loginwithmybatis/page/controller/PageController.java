package com.example.loginwithmybatis.page.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/goLogin")
    public String login(){
        return "login";
    }

    @GetMapping("/goSignUp")
    public String signup(){
        return "signup";
    }
}
