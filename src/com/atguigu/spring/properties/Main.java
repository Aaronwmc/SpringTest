package com.atguigu.spring.properties;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/atguigu/spring/properties/beans-properties.xml");
		
		DataSource dataSource = (DataSource) context.getBean("datasource");
		
		System.out.println(dataSource.getConnection());
	}

}
