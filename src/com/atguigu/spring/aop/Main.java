package com.atguigu.spring.aop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticCalculator arithmeticCalculator = null;
		arithmeticCalculator = new ArithmeticCalculatorImpl();
		double resultAdd = arithmeticCalculator.add(1, 2);
		
		System.out.println(resultAdd);
		
		double resultSub = arithmeticCalculator.sub(7, 2);
		System.out.println(resultSub);
	}

}
