package com.java.String;

import java.util.Scanner;

public class String2 {
	/*
	 * A:案例演示
		* 需求:统计一个随意输入的字符串中大写字母字符,小写字母字符,数字字符出现的次数,其他字符出现的次数
		* 用正则匹配
		* ABCDEabcd123456!@#$%^
	*/
	public static void main(String[] args) {
		getNum();
	}
	
	public static void getNum(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入");
		String line = sc.nextLine();
		String[] arr = line.split("");
		int da = 0, xiao = 0, num = 0, other = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].matches("\\d")) {
				num++;
			}else if(arr[i].matches("[a-z]")){
				xiao++;
			}else if (arr[i].matches("[A-Z]")) {
				da++;
			}else
				other++;
		}
		System.out.println("大写" + da);
		System.out.println("小写" + xiao);
		System.out.println("数字" + num);
		System.out.println("其他" + other);
		
	}
}
