package com.java.test;

import java.util.Scanner;

public class Demo2_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("�������ʺ�");
			String userName = sc.nextLine();
			System.out.println("����������");
			String password = sc.nextLine();
			if("admin".equals(userName) && "admin".equals(password)){
				System.out.println("��ӭ����");
				break;
			}else {
				if(i == 2){
					System.out.println("����Ļ����Ѿ��ù���");
				}else 
				System.out.println("���������룬" + "������" + (2 - i) + "�λ���");
			}
			
		}
	}

}
