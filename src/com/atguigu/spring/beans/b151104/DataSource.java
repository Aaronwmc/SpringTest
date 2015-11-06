package com.atguigu.spring.beans.b151104;

import java.util.Properties;

public class DataSource {
	
	private Properties properties;
	public DataSource(){
		
	}
	public DataSource(Properties properties) {
		this.properties = properties;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "Properties [properties=" + properties + "]";
	}
	
	
}
