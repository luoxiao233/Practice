package com.java.scanner;

import java.util.Scanner;

public class Demo1_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);    //��������¼�����
		System.out.println("��ʾ����");
		if(sc.hasNextInt()){           //��������ֵ����
			int x = sc.nextInt();      //��x�������������
			System.out.println(x);
		} else
			System.out.println("����Ĳ���");
		
	}

}
