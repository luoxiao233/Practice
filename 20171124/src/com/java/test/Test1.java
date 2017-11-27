package com.java.test;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Test1 {

	public static void main(String[] args) throws Exception {      //这里必须抛出异常，这类事很重要的
		/*
		 * 	* 需求：算一下你来到这个世界多少天?

				/**
				 * * A:案例演示
				 * 需求：算一下你来到这个世界多少天?
				 * 分析:
				 * 1,将生日字符串和今天字符串存在String类型的变量中
				 * 2,定义日期格式化对象
				 * 3,将日期字符串转换成日期对象
				 * 4,通过日期对象后期时间毫秒值
				 * 5,将两个时间毫秒值相减除以1000,再除以60,再除以60,再除以24得到天
				 * @throws ParseException 
				 */
		String birth ="1994年08月09日";
		String today = "2017年11月24日";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		Date d1 = sdf.parse(birth);
		Date d2 = sdf.parse(today);
		long time = d2.getTime() - d1.getTime();
		System.out.println(time / 1000 / 60 / 60 / 24 );	
	}

}
