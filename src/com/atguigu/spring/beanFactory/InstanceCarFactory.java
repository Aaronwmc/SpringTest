package com.atguigu.spring.beanFactory;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {
	
	private Map<String, Car> cars = null ;
	
	public InstanceCarFactory(){
		cars = new HashMap<String, Car>();
		cars.put("audi", new Car("Audi",320000));
		cars.put("ford", new Car("Ford",410000));
	}
	
	public Car getCar(String name){
		return cars.get(name);
	}
}
