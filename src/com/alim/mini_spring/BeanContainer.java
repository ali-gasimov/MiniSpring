package com.alim.mini_spring;

import java.util.HashMap;
import java.util.Map;

public class BeanContainer {

	private final Map<Class<?>, Object> beans = new HashMap<>();
	
	public void addBean(Class<?> clazz, Object object ) {
		
		beans.put(clazz, object);
	}
	
	public Object getBean(Class<?> clazz) {
		
		return beans.get(clazz);
		
	}
}