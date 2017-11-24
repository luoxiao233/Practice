package com.java.otherclass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo7_SimpleDateFormat {

	public static void main(String[] args) {
		/*
		 * DateFormat是日期或者时间的抽象类，一般来说使用子类
		 * SimpleDateFormat
		 */
//		demo1();
//		demo2();

		
	}

	static void demo2() {
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//类似正则 规则
		String s = df.format(d);
		System.out.println(s);   // 2017年11月24日 20:59:03 
	}

	static void demo1() {
		Date d = new Date();
		DateFormat df = new SimpleDateFormat();
		String s = df.format(d);
		System.out.println(s);      //17-11-24 下午8:57 (这是默认的)
	}

}
