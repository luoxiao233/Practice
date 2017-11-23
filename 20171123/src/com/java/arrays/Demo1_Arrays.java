package com.java.arrays;

import java.util.Arrays;

public class Demo1_Arrays {
	/*
	 * Arrays 的三个重要方法：
	 * Arrays.toString() 返回指定数组内容的字符串表示形式。(括号中为数组)
	 * Arrays.sort() 根据指定比较器产生的顺序对指定对象数组的指定范围进行排序(括号中为数组)
	 * Arrays.binarySearch() 使用二分搜索法来搜索指定数组，以获得指定的值(括号中为有序数组)
	 */

	public static void main(String[] args){
//		demo1();
//		demo2();
		int[] arr = {0,1,2,3,4,5,6,7,8};
		int i = Arrays.binarySearch(arr, 4);  //对数字数组进行二分法查找索引值
		System.out.println(i);
	}

	static void demo2() {
		int[] arr = {11,33,22,44,55};
		Arrays.sort(arr);        // 对数字数组进行排序
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static void demo1() {
		int[] arr = {11,22,33};
		String s = Arrays.toString(arr);  //把数字数组 转化为数字字符串
		System.out.println(s);
	}
}
