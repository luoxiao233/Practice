package com.java.test;

import java.util.Scanner;

public class Demo2_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入帐号");
			String userName = sc.nextLine();
			System.out.println("请输入密码");
			String password = sc.nextLine();
			if("admin".equals(userName) && "admin".equals(password)){
				System.out.println("欢迎进入");
				break;
			}else {
				if(i == 2){
					System.out.println("今天的机会已经用光了");
				}else 
				System.out.println("请重新输入，" + "您还有" + (2 - i) + "次机会");
			}
			
		}
	}

}
