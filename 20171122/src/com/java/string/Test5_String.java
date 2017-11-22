package com.java.string;

import java.util.Scanner;

public class Test5_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入字符串");
		String s = "";
		String s1 = sc.nextLine();
		char[] arr = s1.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			s = s + arr[i];          // 在这一步的过程中会覆盖对象，浪费资源，形成垃圾
		}
		System.out.println(s);
	}

}
