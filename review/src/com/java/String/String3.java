package com.java.String;

import java.util.Scanner;

public class String3 {
	/*
	 * * A:������ʾ
	 	* ����:����һ���������մ�дСд��дСд������˳���ӡ����.(ֻ����Ӣ�Ĵ�Сд��ĸ�ַ�)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���붫��");
		String s = sc.nextLine();
		String[] arr = s.split("");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				sb.append(arr[i].toUpperCase());
			}else
				sb.append(arr[i].toLowerCase());
		}
		sb.toString();
		System.out.println(sb);
	}

}
