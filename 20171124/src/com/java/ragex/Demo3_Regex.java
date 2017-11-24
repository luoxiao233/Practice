package com.java.ragex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo3_Regex {

	public static void main(String[] args) {
		/*
		 * 取出"手机号13456789231,haiyou15345678909"里面的手机号码
		 */
		String s = "手机号13456789231,haiyou15345678909";
		String regex = "1[3,5]\\d{9}";   //正则规则：第一位为1，第二位为3或者5，\\d{9}表示任意的9个数字。
		Pattern p = Pattern.compile(regex);   //获取到Pattern对象     compile 编译
		Matcher m = p.matcher(s);		//获匹配器
		while (m.find()) {          //如果找到匹配的字符串
			System.out.println(m.group());    //用group()方法获取出来
		}
	}

}
