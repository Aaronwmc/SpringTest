package com.atguigu.spring.beans.b151101;

import java.util.Map;

public class Person {
	private String name;
	private int age;
	private Map<String,Car> cars;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Map<String,Car> getCars() {
		return cars;
	}
	public void setCars(Map<String,Car> cars) {
		this.cars = cars;
	}
	@Override
	public String toString(){
		return "name:"+name+"\tage:"+age+"\tcars:"+cars;	
	}
	
	
}
