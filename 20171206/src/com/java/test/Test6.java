package com.java.test;

public class Test6 {
/*
 * 쳲��������ݹ飩
 */
	public static void main(String[] args) {
		System.out.println(getNum(12));
	}
	public static int getNum(int num){
		if (num == 1 || num ==2) {
			return 1;
		}else{
			return getNum(num-2) + getNum(num-1);
		}
	}
}
