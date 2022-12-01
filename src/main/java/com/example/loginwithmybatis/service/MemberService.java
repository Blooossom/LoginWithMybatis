package com.example.loginwithmybatis.service;


import com.example.loginwithmybatis.member.MemberDTO;
import com.example.loginwithmybatis.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {


    @Autowired
    MemberRepository mr;
    public int signUp(MemberDTO memberDTO){
        return mr.signUp(memberDTO);
    }

    public MemberDTO login(MemberDTO memberDTO){
        return mr.login(memberDTO);
    }


}
