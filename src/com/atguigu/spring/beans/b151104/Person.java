package com.atguigu.spring.beans.b151104;

public class Person {
	private String number;
	private String name;
	private String sex;
	private int age;
	
	public Person(){
		
	}
	public Person(String number, String name, String sex, int age) {
		this.number = number;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [number=" + number + ", name=" + name
				+ ", sex=" + sex + ", age=" + age + "]";
	}
	
	
}
