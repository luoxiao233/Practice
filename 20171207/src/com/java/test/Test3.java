package com.java.test;

import java.util.ArrayList;

public class Test3 {
	/*
	 * 约瑟夫环 :幸运数字
	 * 解释：一群人站作一个圈，从1开始计数，遇到3就剔除，直到最后只剩一个（简称：约瑟夫环）
	 */
	public static void main(String[] args) {
		System.out.println(getLucky(7));
	}

	public static int getLucky(int num){
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= num; i++) {
			list.add(i);                     //把每个人输入到一个可排序集合中（这是必须的）
		}
		int count = 1;         				//从1开始计数
		for (int i = 0; list.size() != 1; i++) {      //最后剩一个人的时候才停止（只要一个人）
			if (i == list.size()) {             //当数到了数组最大值时，把i拨为0， 重新来过
				i = 0 ;
			}
			if (count % 3 == 0) {         //如果遇到了3的倍数就 剔除
				list.remove(i--);         //remove剔除后，数组向前覆盖，--是必须的
			}
			count++;	 				//累加的计时器
		}
		return list.get(0);
	}
}
