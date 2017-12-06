package com.java.test;

import java.math.BigInteger;

public class Test7 {
/*
 * 分别求1000！一共有多少个0 和末尾一共有多少个0
 * 要算出1000！ 只能用BigInteger(特点：里面的运算都是用方法，不能用字符运算)
 */
	public static void main(String[] args) {
		demo1();     //获得里面0的个数
		demo2();	 //获得尾数0的个数
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
		System.out.println("末尾有" + count + "个0");
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
		System.out.println("一共有" + num + "个0");
	}
}
