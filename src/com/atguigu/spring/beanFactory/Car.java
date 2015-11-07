package com.atguigu.spring.beanFactory;

public class Car {

	public Car() {
		System.out.println("---Car's constructor--");
	}

	public Car(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	private String brand;
	private double price;

	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Car(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		System.out.println("brand's getter");
		return brand;
	}

	public void setBrand(String brand) {
		System.out.println("brand's setter");
		this.brand = brand;
	}
	
	public void init(){
		System.out.println("init--");
	}
	
	public void destroy(){
		System.out.println("destroy---");
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + "\tprice=" + price +"]";
	}
}
