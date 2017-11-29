package com.java.set;

import java.util.LinkedHashSet;

public class Demo2_LinkedHashSet {
	/*
	 * * B:案例演示
			* LinkedHashSet的特点
				* 可以保证怎么存就怎么取 
				* 1.底层是链表实现的,是Set集合中唯一一个能保证怎么存就怎么取的集合对象
			 	* 2.因为是HashSet的子类,所以也保证了元素是唯一的,与HashSet的原理一样
	 */	
	public static void main(String[] args){
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("c");
		lhs.add("b");
		lhs.add("d");
		lhs.add("d");
		lhs.add("d");
		lhs.add("g");
		lhs.add("h");
		System.out.println(lhs);  //[c, b, d, g, h]完全是按照存取的顺序打印出来的（除去重复的）
	}
	
}
