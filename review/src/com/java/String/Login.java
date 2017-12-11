package com.java.String;

import java.util.Scanner;

public class Login {
	/*
	 * 	* 需求:模拟登录,给三次机会,并提示还有几次
	 		* 用户名和密码都是admin
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("输入用户名");
			String UserName = sc.nextLine();
			System.out.println("输入密码");
			String PWD = sc.nextLine();
			
			if ("admin".equals(UserName) && "admin".equals(PWD)) {
				System.out.println("已进入");
				break;
			}else{
				if (i == 2) {
					System.out.println("你没机会了");
				}else
					System.out.println("你还剩" + (2-i) + "次机会");
			}
			
		}
	}

}
