package com.java.regex;

public class Demo5_Method {

	public static void main(String[] args) {
		String s = "haha hehe xixi";   
		String[] arr = s.split(" ");           //����������Ϊ��s �ָ�Ϊ��{hehe,hehe,xixi}��String����
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
