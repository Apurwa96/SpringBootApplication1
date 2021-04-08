package com.example.demo.controller;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloStringBoot {

	@PostMapping(value="/api")
	public String helloSpring()
	{
		System.out.println("Hello from Spring Boot Controller");
		return "Welcome to Spring Boot Application";
	}

	@GetMapping(value="/login")
	public String loginMethod(@Valid @RequestHeader(name="username", required = true) String username, @RequestHeader(name="password", required = true) String password) throws Exception

			//@Valid LoginCredentials loginObject)
	{

		if(username.equals("admin") && password.equals("password"))
		return "Login Successful.";
		else
			return "login failed";
	}
}


//