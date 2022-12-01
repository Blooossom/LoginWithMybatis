package com.example.loginwithmybatis.mapper;

import com.example.loginwithmybatis.member.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {


    public int signUp(MemberDTO memberDTO);
    public MemberDTO login(MemberDTO memberDTO);


}
