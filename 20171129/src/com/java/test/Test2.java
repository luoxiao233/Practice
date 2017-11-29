package com.java.test;

import java.util.HashSet;
import java.util.Scanner;

public class Test2 {
	/*
	 *  使用Scanner从键盘读取一行输入,去掉其中重复字符, 打印出不同的那些字符
	 		* aaaabbbcccddd
	 		* 
	 	分析:
	 	1.键盘录入,用Scanner
	 	2.去除重复字符,创建Set集合
	 	3.用nextLine方法接收,将字符串转换成字符串数组,
	 	4.遍历数组,存储到Set集合中,自动去除重复
	 	5.遍历集合,打印出不同的字符
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入");
		String s = sc.nextLine();
		String[] arr = s.split("");          //用空字符串分隔开s  得到数组
		HashSet<String> hs = new HashSet<>();
//		for (int i = 0; i < arr.length; i++) {
//			hs.add(arr[i]);
//		}   这种和下面这种是一样的
		for (String String : arr) {
			hs.add(String);
		}

		for (String string : hs) {
			System.out.print(string);
		}
	}

}
