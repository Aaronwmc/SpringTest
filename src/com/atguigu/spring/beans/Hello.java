package com.atguigu.spring.beans;

public class Hello {

	private String message;

	public void getMessage() {
		System.out.println("message:"+message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
