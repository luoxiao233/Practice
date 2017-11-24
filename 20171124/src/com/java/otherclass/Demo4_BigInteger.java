package com.java.otherclass;

import java.math.BigInteger;

public class Demo4_BigInteger {

	public static void main(String[] args) {
		/*
		 * BigInteger
		 * 可以让超过Integer范围的数字进行运算
		 */
		
		BigInteger b = new BigInteger("100");
		BigInteger b1 = new BigInteger("2");
		
		System.out.println(b.add(b1));        //相加
		System.out.println(b.subtract(b1));  // 相减
		System.out.println(b.multiply(b1));   //相乘
		System.out.println(b.divide(b1));      //相除
	}

}
