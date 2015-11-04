package com.atguigu.spring.beans.b151104;

public class House {

	private String number;
	private String address;
	private Person master;
	public House(String number, String address, Person master) {
		this.number = number;
		this.address = address;
		this.master = master;
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
	public Person getMaster() {
		return master;
	}
	public void setMaster(Person master) {
		this.master = master;
	}
	@Override
	public String toString() {
		return "House [number=" + number + ", address=" + address + ", master="
				+ master + "]";
	}
	
	
}
