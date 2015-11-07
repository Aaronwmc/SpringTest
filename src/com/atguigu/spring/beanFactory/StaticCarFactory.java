package com.atguigu.spring.beanFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 静态工厂方法：直接调用一个类的静态方法可以返回类的实例
 */
public class StaticCarFactory {
	
	private static Map<String, Car> cars = new HashMap<String, Car>();
	
	static{
		cars.put("audi",new Car("Audi",300000));
		cars.put("ford", new Car("Ford",400000));
	}
	
	public static Car getCar(String name){
		return cars.get(name);
	}
}
