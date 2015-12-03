package com.atguigu.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring.annotation.controller.UserController;
import com.atguigu.spring.annotation.repository.UserRepository;
import com.atguigu.spring.annotation.service.UserService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/atguigu/spring/annotation/beans-annotation.xml");
		
//		TestObject to = (TestObject) ctx.getBean("testObject");
//		System.out.println(to);
//		
		UserController uc = (UserController) ctx.getBean("userController");
		System.out.println(uc);
		uc.excute();
//		
//		UserService us = (UserService) ctx.getBean("userService");
//		System.out.println(us);
		
//		UserRepository uri = (UserRepository) ctx.getBean("userRepository");
//		System.out.println(uri);
	}

}
