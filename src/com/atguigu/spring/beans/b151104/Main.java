package com.atguigu.spring.beans.b151104;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("com/atguigu/spring/beans/b151104/beans.xml");
		House house = (House) context.getBean("house");
		System.out.println(house);
	}
}
