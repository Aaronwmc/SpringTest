package com.atguigu.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/atguigu/spring/test/beans-t.xml");
		UserService userService = (UserService) ctx.getBean("userService");
		userService.add();
		
	}

}
