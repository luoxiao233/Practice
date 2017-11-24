package com.java.otherclass;

import java.util.Date;

public class Demo6_Date {

	public static void main(String[] args) {
		/*
		 * Date  主要表示时间的类
		 */
//		demo1();
		Date d = new Date();
		System.out.println(d.getTime());  //从现在到1970年的时间，用毫秒表示
		System.out.println(System.currentTimeMillis());//从现在到1970年的时间，用毫秒表示。显示的是一样的
	}

	static void demo1() {
		Date d1 = new Date();
		System.out.println(d1);  //Fri Nov 24 20:22:55 CST 2017
		
		Date d2 = new Date(1000);   //在1970/01/01 00:00:00  加上1000毫秒
		System.out.println(d2);   //Thu Jan 01 08:00:01 CST 1970
	}
}
