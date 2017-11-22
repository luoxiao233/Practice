package com.java.test;

import java.util.Scanner;

public class Demo2_Test {

	public static void main(String[] args) {
		/*
		 * * A:案例演示
			* 
					需求：把字符串反转
						举例：键盘录入"abc"		
						输出结果："cba"
						
					用StringBuffer的功能实现	
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个字符串");
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		System.out.println(sb.reverse());
	}

}
