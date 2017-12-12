package com.java.reflect;

import java.lang.reflect.Constructor;

import com.java.bean.Person;

public class Demo3_Constructor {
	/*
	 * 通过反射获取带参构造方法并使用)
	* Constructor
		* Class类的newInstance()方法是使用该类无参的构造函数创建对象, 
		* 如果一个类没有无参的构造函数, 就不能这样创建了,
		* 可以调用Class类的getConstructor(String.class,int.class)方法获取一个指定的构造函数
		* 然后再调用Constructor类的newInstance("张三",20)方法创建对象
	 */
	public static void main(String[] args) throws Exception {
		//1.得到字节码对象
		Class clazz = Class.forName("com.java.bean.Person");
		
		//2.获取到类中的构造方法
		Constructor[] arr = clazz.getConstructors();
		for (Constructor constructor : arr) {
			System.out.println(constructor);
		}
		
		//3.通过字节码对象反射得到有参的构造方法
		Constructor c = clazz.getConstructor(String.class,int.class);
		
		//4.通过有参构创建对象
		Person p = (Person) c.newInstance("张三",23);
		System.out.println(p);
	}

}
