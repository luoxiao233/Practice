package com.java.regex;

public class Demo4_Regex {

	public static void main(String[] args) {
		/*
		 * Greedy 数量词 
			X? X，一次或一次也没有 
			X* X，零次或多次 (包括一次)
			X+ X，一次或多次 
			X{n} X，恰好 n 次 
			X{n,} X，至少 n 次 
			X{n,m} X，至少 n 次，但是不超过 m 次
		 */
		String regex = "[abcd]?";
		String regex1 = "[abcd]*";
		String regex2 = "[abcd]{4,}";
		System.out.println("".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("e".matches(regex));
		
		System.out.println(" ".matches(regex1));
		System.out.println("e".matches(regex1));
		System.out.println("abcd".matches(regex2));
	}

}
