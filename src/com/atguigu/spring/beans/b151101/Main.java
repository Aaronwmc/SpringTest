package com.atguigu.spring.beans.b151101;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/atguigu/spring/beans/b151101/beans.xml");
		/*Car car = (Car) context.getBean("car");
		System.out.println(car.toString());*/
		Person person = (Person) context.getBean("person1");
		System.out.println(person);
	}

}
