package com.java.test;

import java.util.Calendar;
import java.util.Scanner;

public class Demo3_Test {
/*
 * 输入一个数来判断是不是闰年
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个数");
		String line = sc.nextLine();      //用字符串line来接收这个数
		int year = Integer.parseInt(line);  //把字符串line  转为  整型
		
		boolean b=  getYear(year);   //用getYear（）来判断
		System.out.println(b);
	}

	private static boolean getYear(int year) {
		Calendar c = Calendar.getInstance();      //创造当前时间对象，里面包含全部时间
		c.set(year,2,1);                      //设置这个对象的时间为 该年3月1日  （因为默认月是从0开始算的，所以为2）
		c.add(Calendar.DAY_OF_MONTH, -1);        // 这个日期上减一天  那么就是2月的最后一天
		
		return c.get(Calendar.DAY_OF_MONTH) == 29;
	}

}
