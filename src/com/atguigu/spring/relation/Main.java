package com.atguigu.spring.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/atguigu/spring/relation/beans-relation.xml");
		Address address = null;//(Address) context.getBean("address");
		//System.out.println(address);
		
		address = (Address) context.getBean("address1");
		System.out.println(address);
		
		Person person = (Person) context.getBean("person");
		System.out.println(person);
	}

}
