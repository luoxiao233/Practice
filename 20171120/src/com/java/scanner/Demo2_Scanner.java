package com.java.scanner;

import java.util.Scanner;

public class Demo2_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		����������£������һ�����͹��󰴻س����Զ���ʾ��x��ֵ��Ȼ����治������������һ���ַ���,����ַ�����Ĭ��Ϊ�յ�
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ������");
		int x = sc.nextInt();
		
		System.out.println("����һ���ַ���");
		String y = sc.nextLine();
		
		System.out.println(x + "-----" + y);
	}
}