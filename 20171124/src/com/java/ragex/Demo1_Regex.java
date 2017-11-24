package com.java.ragex;

public class Demo1_Regex {

	public static void main(String[] args) {
		/*
		 * split(regex)的用法
		 * repleaceAll(regex," ")的用法
		 */
//		demo1();
		demo2();
		
	}

	static void demo2() {
		String s= "wo1xiang2jing3jing";
		String regex = "\\d";
		System.out.println(s.replaceAll(regex, ""));
	}

	static void demo1() {
		String s = "qwerrrtyuirrrghjrrnr";
		String regex = "[r]+";
		String[] arr = s.split(regex);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
