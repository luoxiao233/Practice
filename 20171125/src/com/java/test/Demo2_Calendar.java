package com.java.test;

import java.util.Calendar;

public class Demo2_Calendar {
/*
 * Calendar中文译为日期，经常同YEAR,MONTH,DAY_OF_MONTH,HOUR等联用
 */
	public static void main(String[] args) {
//		demo1();//Calendar的基本用法
		Calendar c = Calendar.getInstance();      //创建出来的这个对象是现在的时间
		c.add(Calendar.YEAR, 3);         //YEAR=2017 + 3 = 2020
		System.out.println(c);   //打印出来的是一个对象，其实包含了对象中的很多值，例如MONTH=10,WEEK_OF_YEAR=47,WEEK_OF_MONTH=4,DAY_OF_MONTH=25。。
		c.set(2008, 7, 8);	 //将默认对象中的年月日 修改为YEAR=2008  MONTH=6  DAY_OF_MONTH=8   
	}

	static void demo1() {
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));      //2017
		System.out.println(c.get(Calendar.MONTH));   //默认从0开始，最大值为11
		System.out.println(c.get(Calendar.DAY_OF_MONTH));   // 25
		System.out.println(c.get(Calendar.DAY_OF_WEEK));  // 默认从周日开始起算为1， 最大值为7（周六）
	}

}
