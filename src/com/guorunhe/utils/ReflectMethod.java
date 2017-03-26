package com.guorunhe.utils;

import java.lang.reflect.Method;

public class ReflectMethod {
	
	/**
	 * 根据属性返回职位类的对应的set方法.
	 * 
	 * @param suffix 职位属性名.
	 * @throws ClassNotFoundException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * 
	 * @return.
	 */
	public Method getClassPropertySetMethodString(String className, String property) throws ClassNotFoundException, NoSuchMethodException, SecurityException{
		Class<?> clazz = Class.forName(className);
		String methodName = "set" + property.substring(0, 1).toUpperCase() + property.substring(1);
		Method method = clazz.getMethod(methodName, String.class);
		return method;
	}

}
