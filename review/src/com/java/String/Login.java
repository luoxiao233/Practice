package com.java.String;

import java.util.Scanner;

public class Login {
	/*
	 * 	* ����:ģ���¼,�����λ���,����ʾ���м���
	 		* �û��������붼��admin
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("�����û���");
			String UserName = sc.nextLine();
			System.out.println("��������");
			String PWD = sc.nextLine();
			
			if ("admin".equals(UserName) && "admin".equals(PWD)) {
				System.out.println("�ѽ���");
				break;
			}else{
				if (i == 2) {
					System.out.println("��û������");
				}else
					System.out.println("�㻹ʣ" + (2-i) + "�λ���");
			}
			
		}
	}

}
