package com.java.regex;

public class Demo5_Method {

	public static void main(String[] args) {
		String s = "haha hehe xixi";   
		String[] arr = s.split(" ");           //方法的作用为把s 分割为了{hehe,hehe,xixi}的String数组
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
