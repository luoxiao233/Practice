package com.java.String;

import java.util.Scanner;

public class String2 {
	/*
	 * A:������ʾ
		* ����:ͳ��һ������������ַ����д�д��ĸ�ַ�,Сд��ĸ�ַ�,�����ַ����ֵĴ���,�����ַ����ֵĴ���
		* ������ƥ��
		* ABCDEabcd123456!@#$%^
	*/
	public static void main(String[] args) {
		getNum();
	}
	
	public static void getNum(){
		Scanner sc = new Scanner(System.in);
		System.out.println("������");
		String line = sc.nextLine();
		String[] arr = line.split("");
		int da = 0, xiao = 0, num = 0, other = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].matches("\\d")) {
				num++;
			}else if(arr[i].matches("[a-z]")){
				xiao++;
			}else if (arr[i].matches("[A-Z]")) {
				da++;
			}else
				other++;
		}
		System.out.println("��д" + da);
		System.out.println("Сд" + xiao);
		System.out.println("����" + num);
		System.out.println("����" + other);
		
	}
}
