package com.java.test;

public class Test3 {
/*
 * 递归之算出阶乘数
 * 规律： 
 * 5！ = 5 * 4！
 * 			4！ = 4 * 3！
 * 					3！ = 3 * 2！
 * 							 2！ = 2 * 1！
 *   
 */
	public static void main(String[] args) {
		System.out.println(fun(5));
	}
	public static int fun(int num){
		/*if (num == 1) {
			return 1;
		}else{
			return num * fun(num - 1);
		}*/
		
		return num == 1 ? 1 : num * fun(num - 1);
	}
}
