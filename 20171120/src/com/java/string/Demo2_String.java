package com.java.string;

public class Demo2_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demo1();
		//Demo2();
		String s1 = new String("abc");
		String s2 = "abc";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

	static void Demo2() {
		String s1 = new String("abc");//创建了两个对象
	}

	static void Demo1() {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2);      //ture
		System.out.println(s1.equals(s2));  //true
	}

}
