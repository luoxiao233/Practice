package com.java.method;

public class Demo2_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "010234567890";
		String s1 = "零一二三四五六七八九二";
//		System.out.println(s.length());          //字符串长度
//		System.out.println(s1.charAt(5));        // 字符串索引第5个显示。。
//		System.out.println(s1.indexOf("二"));     //字符串中 二 的索引值为。。
//		System.out.println(s.indexOf("12"));     //出现12的首要位置
		System.out.println(s.indexOf('0', 4));    //如果要查询0的索引 从索引值4开始向右查找出来的第一个
		System.out.println(s1.indexOf('二', 3));
		System.out.println(s1.lastIndexOf('一'));   //从右开始向左查找
	}

}
