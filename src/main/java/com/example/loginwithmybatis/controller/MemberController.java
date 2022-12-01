package com.example.loginwithmybatis.controller;


import com.example.loginwithmybatis.member.MemberDTO;
import com.example.loginwithmybatis.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {


    @Autowired
    MemberService ms;

    @PostMapping("signup")
    public String signUp(MemberDTO memberDTO){
        ms.signUp(memberDTO);
        return "index";
    }

    @PostMapping("login")
    public String login(MemberDTO memberDTO){
        ms.login(memberDTO);
        return "index";
    }


}
