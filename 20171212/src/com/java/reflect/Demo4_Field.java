package com.java.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.java.bean.Person;

public class Demo4_Field {
	/*
	 * 通过反射获取成员变量并使用) Field * Class.getField(String)方法可以获取类中的指定字段(可见的),
	 * 如果是私有的可以用getDeclaedField("name")方法获取,通过set(obj, "李四")方法可以设置指定对象上该字段的值,
	 * 如果是私有的需要先调用setAccessible(true)设置访问权限,用获取的指定的字段调用get(obj)可以获取指定对象中该字段的值
	 */
	public static void main(String[] args) throws Exception {
		//1.获取字节码对象
		Class clazz = Class.forName("com.java.bean.Person");
		
		//2.通过字节码对象反射得到构造器，用构造方法创造新对象
		Constructor c = clazz.getConstructor(String.class,int.class);
		Person p = (Person) c.newInstance("张三",23);
		System.out.println(p);
		
		//3.想要强行改变对象中的值
		
		Field f = clazz.getDeclaredField("name");//暴力反射获取字段
		f.setAccessible(true);			//去除私有权限
		f.set(p, "李四");
		System.out.println(p);
	}

}
