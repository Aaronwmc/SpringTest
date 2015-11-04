package com.atguigu.spring.beans.b151101;

public class Car {

	private String name;
	private double weight;
	private int maxSpeed;
	public Car(String name, double weight, int maxSpeed) {
		this.name = name;
		this.weight = weight;
		this.maxSpeed = maxSpeed;
	}
	
	@Override
	public String toString(){
		return "name:"+name+"\tweight:"+weight+"kg \tmaxSpeed:"+maxSpeed+"km/h";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
	
}
