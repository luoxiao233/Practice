package com.java.test;

public class Test2_Args {

	public static void main(String[] args) {
		String s = "haha";
		System.out.println(s);   //haha
		change(s);              //方法弹栈，里面的一切变为垃圾
		System.out.println(s);  //haha   所以还是打印出来haha
		
		StringBuffer sb = new StringBuffer("123");
		System.out.println(sb);    //123
		change(sb);					//只有一个缓冲区
		System.out.println(sb);    //123123
	}

	public static void change(String s) {
		s += "123";
	}
	public static void change(StringBuffer sb) {
		sb.append("123");
	}

}
