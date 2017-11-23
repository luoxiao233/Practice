package com.java.regex;

public class Demo3_Regex {

	public static void main(String[] args) {
		/*预定义字符类 
			. 任何字符 
			\d 数字：[0-9] 
			\D 非数字： [^0-9] 
			\s 空白字符：[ \t\n\x0B\f\r] 	
			\S 非空白字符：[^\s] 
			\w 单词字符：[a-zA-Z_0-9] 
			\W 非单词字符：[^\w]*/
//		demo1();
//		demo2();
		
		
	}

	static void demo2() {
		String regex = "\\w";    //一个字符， 还只能是[a-zA-Z_0-9]之间的
		System.out.println(" ".matches(regex));
		System.out.println("a".matches(regex));
	}

	static void demo1() {
		String regex = ".";       //表示的是 能够通过随便一个字符（包括空）
		System.out.println(" ".matches(regex));
	}
}
