package com.atguigu.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/atguigu/spring/test/beans-generic.xml");
		Calculator calculator = context.getBean(Calculator.class);
		double a = calculator.div(8, 2);
		System.out.println(a);
	}

}
