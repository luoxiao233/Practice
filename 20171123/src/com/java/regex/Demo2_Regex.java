package com.java.regex;

public class Demo2_Regex {

	public static void main(String[] args) {
		/*字符类 
			[abc] a、b 或 c（简单类） 
			[^abc] 任何字符，除了 a、b 或 c（否定） 
			[a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围） 
			[a-d[m-p]] a 到 d 或 m 到 p：[a-dm-p]（并集） 
			[a-z&&[def]] d、e 或 f（交集） 
			[a-z&&[^bc]] a 到 z，除了 b 和 c：[ad-z]（减去） 
			[a-z&&[^m-p]] a 到 z，而非 m 到 p：[a-lq-z]（减去）*/
//		demo1(); 
//		demo2();
	}

	static void demo2() {
		String regex = "[^abc]"; //则表示只能通过一个字符，且这个字符只要不是a,b,c其中一个即可
		System.out.println("d".matches(regex));
		System.out.println("a".matches(regex));
	}

	static void demo1() {
		String regex = "[abc]";          //此正则表示只能通过一个字符，且这个字符只能是a,b,c其中一个
		System.out.println("a".matches(regex));
		System.out.println("ab".matches(regex));
	}

}
