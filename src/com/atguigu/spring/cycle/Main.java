package com.atguigu.spring.cycle;

import java.awt.font.TextLayout.CaretPolicy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring.beanFactory.Car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/atguigu/spring/cycle/beans-cycle.xml");
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		ctx.close();
	}

}
