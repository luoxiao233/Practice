package com.java.string;

import java.util.Scanner;

public class Test5_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ַ���");
		String s = "";
		String s1 = sc.nextLine();
		char[] arr = s1.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			s = s + arr[i];          // ����һ���Ĺ����лḲ�Ƕ����˷���Դ���γ�����
		}
		System.out.println(s);
	}

}
