package com.atguigu.spring.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.atguigu.spring.annotation.TestObject;
import com.atguigu.spring.annotation.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired(required=false)  
	private TestObject testObject;
	public void excute(){
		System.out.println("UserController excute");
		userService.add();
		//System.out.println(testObject);
	}
}
