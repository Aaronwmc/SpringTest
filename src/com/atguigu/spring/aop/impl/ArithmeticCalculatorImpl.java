package com.atguigu.spring.aop.impl;

import org.springframework.stereotype.Component;

@Component
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

	@Override
	public double add(double a, double b) {
		double result = a + b;
		return result;
	}

	@Override
	public double sub(double a, double b) {
		double result = a - b;
		return result;
	}

	@Override
	public double mul(double a, double b) {
		double result = a * b;
		return result;
	}

	@Override
	public double div(double a, double b) {
		double result = a / b;
		return result;
	}

}
