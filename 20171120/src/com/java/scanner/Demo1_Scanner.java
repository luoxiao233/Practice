package com.java.scanner;

import java.util.Scanner;

public class Demo1_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);    //创建键盘录入对象
		System.out.println("提示输入");
		if(sc.hasNextInt()){           //如果这个数值整型
			int x = sc.nextInt();      //用x来接收这个整型
			System.out.println(x);
		} else
			System.out.println("输入的不对");
		
	}

}
