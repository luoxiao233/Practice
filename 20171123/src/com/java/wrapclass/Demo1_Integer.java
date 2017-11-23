package com.java.wrapclass;

public class Demo1_Integer {

	public static void main(String[] args) {
		/*
		 * Integer 类在对象中包装了一个基本类型 int 的值,
		 * 该类提供了多个方法，能在 int 类型和 String 类型之间互相转换，
		 */
		int i = 200;
		String s = "300";
		
		Integer i1 = new Integer(100);
		System.out.println(i1.MAX_VALUE);   //MAX_VALUE = 2^31 - 1
		
		Integer i2 = new Integer(s);     //String s 转化为了Integer类型
		System.out.println(i2);
	}
}
