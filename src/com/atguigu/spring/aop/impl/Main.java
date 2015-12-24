package com.atguigu.spring.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/atguigu/spring/aop/impl/beans-aopimpl.xml");
		ArithmeticCalculator arithmeticCalculator = ctx.getBean(ArithmeticCalculator.class);
		double resultAdd = arithmeticCalculator.add(1, 2);
		
		System.out.println(resultAdd);
		
		double resultSub = arithmeticCalculator.sub(7, 2);
		System.out.println(resultSub);
	}

}
