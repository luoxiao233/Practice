package com.java.test;

import java.lang.reflect.Field;

public class Test2 {

	public static void main(String[] args) throws Exception, Exception {
		Tool t = new Tool();
		Student s = new Student("张三",23);
		System.out.println(s);
		t.setProperty(s, "name", "李四");
		System.out.println(s);
		
	}

}
class Tool{
	public void setProperty(Object obj,String propertyName,String value) throws Exception, SecurityException{
		Class clazz = obj.getClass();
		Field f = clazz.getDeclaredField(propertyName);
		f.setAccessible(true);
		f.set(obj, value);
	}
}
class Student{
	private String name;
	private int age;
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
