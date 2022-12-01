package com.example.loginwithmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value={"com.example.loginWithMybatis.mapper"})
public class LoginWithMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginWithMybatisApplication.class, args);
	}

}
