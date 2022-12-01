package com.example.loginwithmybatis.repository;


import com.example.loginwithmybatis.mapper.MemberMapper;
import com.example.loginwithmybatis.member.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {


    @Autowired
    MemberMapper mapper;

    public int signUp(MemberDTO memberDTO){
       return mapper.signUp(memberDTO);
    }

    public MemberDTO login(MemberDTO memberDTO){
        return mapper.login(memberDTO);
    }
}
