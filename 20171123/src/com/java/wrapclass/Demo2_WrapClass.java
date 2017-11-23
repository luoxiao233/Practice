package com.java.wrapclass;

public class Demo2_WrapClass {

	public static void main(String[] args) {
		/*
		 * int ->String 方法有四种：
			 * a.直接使用   int + ""   来拼接转成String
			 * b.public static String valueOf(int i)  :开发中推荐使用  String.valueOf(int i)
			 * c.int->Integer->String(Integer类的toString方法())
			 * d.public static String toString(int i)(Integer类的静态方法) Integer.toString(int i)
		 * 
		 * String -- int
			 * 1.String->Integer->int
			 * 2.public static int parseInt(String s)
		 */
		
//		demo1();
		String s = "200";
		Integer in = new Integer(s);     //1    String->Integer
		int i1 = in.intValue();           //1    Integer->String    用intValue()方法
		System.out.println(i1);
		
		int i2 = Integer.parseInt(s);     //  2    Integer.parseInt(s)
		System.out.println(i2);
		
	}

	static void demo1() {
		int i = 100;
		String s1 = i + "";          //a
		System.out.println(s1);
		
		String s2 = String.valueOf(i);  //b
		System.out.println(s2);
		
		Integer in = new Integer(i);   // c   int->Integer
		String s3 = in.toString();     // c   Integer->String
		System.out.println(s3);
		
		String s4 = Integer.toString(i);  //d
		System.out.println(s4);
	}

}
