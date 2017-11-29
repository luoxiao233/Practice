package com.java.test;

import java.util.HashSet;
import java.util.Random;

public class test1 {
	/*
	 * * A:案例演示
	 	* 需求：编写一个程序，获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数输出到控制台。
	 	* 
	 	* 分析:
	 	* 1.获取随机数,用Random类
	 	* 2.要求随机数不能重复,创建一个Set集合
	 	* 3.将随机存储到集合中,set集合中的size如果小于10,一直存储,否则就跳出循环
	 	* 4.遍历集合并输出随机数
	 */
	public static void main(String[] args) {
//		1.创建一个不能重复的set集合
		HashSet<Integer> hs = new HashSet<>();   
//		2.按要求获得随机数
		Random r = new Random();
//		3.循环一直存，直到存满10个
		while(hs.size() < 10){
			hs.add(r.nextInt(20)+1);  //其中的int型直接会变为integer型  自动装箱
		}
		for (Integer integer : hs) {
			System.out.println(integer);
		}
	}

}
