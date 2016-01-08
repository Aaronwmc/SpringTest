package com.atguigu.spring.test;

import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator {

	@Override
	public double add(double x, double y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	@Override
	public double sub(double x, double y) {
		// TODO Auto-generated method stub
		return x - y;
	}

	@Override
	public double mul(double x, double y) {
		// TODO Auto-generated method stub
		return x * y;
	}

	@Override
	public double div(double x, double y) {
		// TODO Auto-generated method stub
		return x / y;
	}

}
