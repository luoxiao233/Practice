package com.java.test;

import java.util.Scanner;

public class Demo2_Test {

	public static void main(String[] args) {
		/*
		 * * A:������ʾ
			* 
					���󣺰��ַ�����ת
						����������¼��"abc"		
						��������"cba"
						
					��StringBuffer�Ĺ���ʵ��	
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ���ַ���");
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		System.out.println(sb.reverse());
	}

}
