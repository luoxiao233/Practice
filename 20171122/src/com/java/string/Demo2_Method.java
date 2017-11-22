package com.java.string;

public class Demo2_Method {

	public static void main(String[] args) {
		/*
		 * 1.String的替换
		 * 2.String的去空格
		 * 3.String字符串之间的比较
		 */
//		Demo1();
//		Demo2();
		String s = "我";
		String s1= "是";
		String s2 = "好人";
		System.out.println('我');
		System.out.println('是');
		System.out.println('我' + 0);      //合着数字时变为unicode
		System.out.println('是' + 0);
		System.out.println(s.compareToIgnoreCase(s1));  //表示的就是两个unicode相减
		
	}

	static void Demo2() {
		String s = "  这是 什么    ";
		System.out.println(s.trim());    //这个方法会去掉左右两边的空格
	}

	static void Demo1() {
		String s = "haha";
		System.out.println(s.replace("a", "e"));
		System.out.println(s.replace("hah","nen"));
	}

}
