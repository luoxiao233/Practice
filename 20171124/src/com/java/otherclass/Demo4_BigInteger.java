package com.java.otherclass;

import java.math.BigInteger;

public class Demo4_BigInteger {

	public static void main(String[] args) {
		/*
		 * BigInteger
		 * �����ó���Integer��Χ�����ֽ�������
		 */
		
		BigInteger b = new BigInteger("100");
		BigInteger b1 = new BigInteger("2");
		
		System.out.println(b.add(b1));        //���
		System.out.println(b.subtract(b1));  // ���
		System.out.println(b.multiply(b1));   //���
		System.out.println(b.divide(b1));      //���
	}

}
