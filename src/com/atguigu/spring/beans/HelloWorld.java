package com.atguigu.spring.beans;

public class HelloWorld {

	private String name;
	private int age;
	private double weight;
	
	public HelloWorld(String name,double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public HelloWorld(String name,int age){
		this.name = name;
		this.age = age;
	}
	public HelloWorld(){
		System.out.println("HelloWorld Constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void hello(){
		System.out.println("hello:"+name+" Your age is:"+age+" Your weight is:"+weight);
	}

}
