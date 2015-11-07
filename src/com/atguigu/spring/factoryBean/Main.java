package com.atguigu.spring.factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/atguigu/spring/factoryBean/bean-factoryBean.xml");
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
	}

}
