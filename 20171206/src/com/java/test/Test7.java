package com.java.test;

import java.math.BigInteger;

public class Test7 {
/*
 * �ֱ���1000��һ���ж��ٸ�0 ��ĩβһ���ж��ٸ�0
 * Ҫ���1000�� ֻ����BigInteger(�ص㣺��������㶼���÷������������ַ�����)
 */
	public static void main(String[] args) {
		demo1();     //�������0�ĸ���
		demo2();	 //���β��0�ĸ���
	}

	public static void demo2() {
		BigInteger bi1= new BigInteger("1");
		for (int i = 1; i <= 1000; i++) {
			BigInteger bi2 = new BigInteger(i + "");
			bi1 = bi1.multiply(bi2);
		}
		System.out.println(bi1);
		String s = bi1.toString();
		String str = new StringBuilder(s).reverse().toString();
		int count = 0 ;
		for (int i = 0; i < str.length(); i++) {
			if('0' != str.charAt(i)) {
				break;
			} else {
				count++;
			}
		}
		System.out.println("ĩβ��" + count + "��0");
	}

	public static void demo1() {
		BigInteger bi1= new BigInteger("1");
		for (int i = 1; i <= 1000; i++) {
			BigInteger bi2 = new BigInteger(i + "");
			bi1 = bi1.multiply(bi2);
		}
		System.out.println(bi1);
		String s = bi1.toString();
		int num = 0;
		/*String[] arr = s.split("");
		for (String c : arr) {
			if ("0".equals(c)) {
				num++;
			}
		}*/
		for (int i = 0; i < s.length(); i++) {
			if ('0' == s.charAt(i)) {
				num++;
			}
		}
		System.out.println("һ����" + num + "��0");
	}
}
