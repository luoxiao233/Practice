package com.java.string;

public class Demo1_Method {

	public static void main(String[] args) {
//		Demo1();
//		Demo2();
//		Demo3();
//		Demo4();
//		Demo5();
	}

	static void Demo5() {
		char[] arr = {'a','b','c','d'};
		String s = String.valueOf(arr);    
		//将字符数组转化为字符串       此处的String.valueOf()括号中任何东西都可以直接转化为字符串
		System.out.println(s);
	}

	static void Demo4() {
		String s= "xixihaha";
		char[] arr = s.toCharArray();           //将字符串 转化为 字符数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static void Demo3() {
		int[] arr = {1,2,3,4};
		String s = "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				s = s + arr[i] + "]";
			}else
				s = s + arr[i] + ", ";
		}
		System.out.println(s);        //得到[1, 2, 3, 4] 
	}

	static void Demo2() {
		/*
		 * 想要得到开头大写的英文
		 */
		String s = "woxiangJingJing";
		//String s2= s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase());
		System.out.println(s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase()));
		//截取字符串第一位使得它大写然后拼接   截取第一位后面的字母使得小写   得到
	}

	static void Demo1() {
		String s = "abc";
		byte[] arr = s.getBytes();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String s2 = "你好你好";
		byte[] arr2 = s2.getBytes();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		String s3 = "琲";
		byte[] arr3 = s3.getBytes();                //把字符串转化为字符数组
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}

}
