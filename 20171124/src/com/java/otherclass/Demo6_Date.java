package com.java.otherclass;

import java.util.Date;

public class Demo6_Date {

	public static void main(String[] args) {
		/*
		 * Date  ��Ҫ��ʾʱ�����
		 */
//		demo1();
		Date d = new Date();
		System.out.println(d.getTime());  //�����ڵ�1970���ʱ�䣬�ú����ʾ
		System.out.println(System.currentTimeMillis());//�����ڵ�1970���ʱ�䣬�ú����ʾ����ʾ����һ����
	}

	static void demo1() {
		Date d1 = new Date();
		System.out.println(d1);  //Fri Nov 24 20:22:55 CST 2017
		
		Date d2 = new Date(1000);   //��1970/01/01 00:00:00  ����1000����
		System.out.println(d2);   //Thu Jan 01 08:00:01 CST 1970
	}
}
