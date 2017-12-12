package com.java.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.java.bean.Person;

public class Demo5_Method {
	/*
	 * Method 
	 * Class.getMethod(String, Class...) 和
	 * Class.getDeclaredMethod(String, Class...)方法可以获取类中的指定方法,调用invoke(Object,
	 * Object...)可以调用该方法,Class.getMethod("eat") invoke(obj)
	 * Class.getMethod("eat",int.class) invoke(obj,10)
	 */
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.java.bean.Person");
		Constructor c = clazz.getConstructor(String.class,int.class);
		Person p = (Person) c.newInstance("张三",23);
		Method[] arr = clazz.getMethods();
		for (Method method : arr) {
			System.out.println(method);
		}
		
		//通过字节码对象获取到原来的方法
		Method m = clazz.getMethod("haha");
		//调用这个方法
		m.invoke(p);
	}

}
