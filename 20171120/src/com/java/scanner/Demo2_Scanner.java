package com.java.scanner;

import java.util.Scanner;

public class Demo2_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		在这种情况下，输入第一个整型过后按回车会自动显示出x的值，然后后面不会再能输入下一个字符串,这个字符串是默认为空的
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个整型");
		int x = sc.nextInt();
		
		System.out.println("输入一个字符串");
		String y = sc.nextLine();
		
		System.out.println(x + "-----" + y);
	}
}
