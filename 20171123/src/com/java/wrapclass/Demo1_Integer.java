package com.java.wrapclass;

public class Demo1_Integer {

	public static void main(String[] args) {
		/*
		 * Integer ���ڶ����а�װ��һ���������� int ��ֵ,
		 * �����ṩ�˶������������ int ���ͺ� String ����֮�以��ת����
		 */
		int i = 200;
		String s = "300";
		
		Integer i1 = new Integer(100);
		System.out.println(i1.MAX_VALUE);   //MAX_VALUE = 2^31 - 1
		
		Integer i2 = new Integer(s);     //String s ת��Ϊ��Integer����
		System.out.println(i2);
	}
}
