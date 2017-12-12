package com.java.reflect;

import com.java.bean.Person;
/*
 * 获取class文件对象的三种方式
 */
public class Demo1_Reflect {

	public static void main(String[] args) throws Exception {
		//1.用Class的自带的静态方法forName
		Class clazz = Class.forName("com.java.bean.Person");
		
		//2.在已知类的条件下，之间用类名.class 得到
		Class clazz1 = Person.class;
		
		//3.创建对象，使用对象中的getClass()方法
		Person p = new Person();
		Class clazz2 = p.getClass();
		
		System.out.println(clazz == clazz1);
		System.out.println(clazz1 == clazz2);
		
	}

}
