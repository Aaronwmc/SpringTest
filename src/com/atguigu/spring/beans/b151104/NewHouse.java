package com.atguigu.spring.beans.b151104;

import java.util.Map;

public class NewHouse {

	private String number;
	private String address;
	private Map<String,Person> masters;
	
	public NewHouse(){
		
	}
	public NewHouse(String number, String address, Map<String,Person> masters) {
		this.number = number;
		this.address = address;
		this.masters = masters;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Map<String,Person> getMaster() {
		return masters;
	}
	public void setMaster(Map<String,Person> masters) {
		this.masters = masters;
	}
	@Override
	public String toString() {
		return "House [number=" + number + ", address=" + address + ", master="
				+ masters + "]";
	}
	
	
}
