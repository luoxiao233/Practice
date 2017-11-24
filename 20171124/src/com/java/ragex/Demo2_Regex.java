package com.java.ragex;

public class Demo2_Regex {

	public static void main(String[] args) {
//		demo1();
		
		/*
		 * 将"我我我。。要。。要。要要要。。。学学学学编编程程程" 变为 "我要学编程"
		 */
		String s = "我我我。。要。。要。要要要。。。学学学学编编程程程";
		String s1 = s.replaceAll("\\。", "");    // 用空字符串替换。
		System.out.println(s1);
		String regex = "(.)\\1+";          //正则规则 规定为 一个字符或者是多个字符
		String s2 = s1.replaceAll("(.)\\1+", "$1");   // 这个$1 代表的是.  也就是它本身  简单的说就是去重
		System.out.println(s2);
	}

	static void demo1() {
		String s = "qweertyyyuioo";
		String regex = "(\\w)\\1+";
		String[] arr = s.split(regex);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
