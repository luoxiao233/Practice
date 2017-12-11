package com.java.String;

import java.util.Scanner;

public class String3 {
	/*
	 * * A:案例演示
	 	* 需求:输入一个数，按照大写小写大写小写这样的顺序打印出来.(只考虑英文大小写字母字符)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入东西");
		String s = sc.nextLine();
		String[] arr = s.split("");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				sb.append(arr[i].toUpperCase());
			}else
				sb.append(arr[i].toLowerCase());
		}
		sb.toString();
		System.out.println(sb);
	}

}
