package com.java.test;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Demo1_DateFormat {
	/*
	 *  * 需求：算一下你来到这个世界多少天?
			 * 分析:
			 * 1,将生日字符串和今天字符串存在String类型的变量中
			 * 2,定义日期格式化对象
			 * 3,将日期字符串转换成日期对象
			 * 4,通过日期对象获取时间毫秒值
			 * 5,将两个时间毫秒值相减除以1000,再除以60,再除以60,再除以24得到天
			 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		String s1 = "1994年08月09日";                     //首先先把生日和几天输入到String中
		String s2 = "2017年11月25日";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");  //用SimpleDateFormat 规定一个表达式
		Date d1 = sdf.parse(s1);
		Date d2 = sdf.parse(s2);              //parse的作用是解析一个文本，然后变为规定的Date格式
		long l1 = d1.getTime();
		long l2 = d2.getTime();           //分别获得各个的毫秒数
		long time = l2 - l1;           //  两个日期相差的 毫秒数
		System.out.println(time / 1000 / 60 / 60 / 24);  
	}

}
