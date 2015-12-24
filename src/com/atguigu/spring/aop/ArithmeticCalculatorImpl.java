package com.atguigu.spring.aop;

public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

	@Override
	public double add(double a, double b) {
		System.out.println("The method add begin with["+a+","+b+"]");
		double result = a + b;
		System.out.println("The method add end with["+result+"]");
		return result;
	}

	@Override
	public double sub(double a, double b) {
		System.out.println("The method sub begin with["+a+","+b+"]");
		double result = a - b;
		System.out.println("The method sub begin with["+a+","+b+"]");
		return result;
	}

	@Override
	public double mul(double a, double b) {
		System.out.println("The method mul begin with["+a+","+b+"]");
		double result = a * b;
		System.out.println("The method mul begin with["+a+","+b+"]");
		return result;
	}

	@Override
	public double div(double a, double b) {
		System.out.println("The method div begin with["+a+","+b+"]");
		double result = a / b;
		System.out.println("The method div begin with["+a+","+b+"]");
		return result;
	}

}
