package com.java.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Test3 {
	/*
	 * 需求: 将集合中的重复元素去掉
	 * 分析:
	 * 1.创建一个List集合,存储若干重复元素
	 * 2.定义方法,去除重复
	 * 3.调用方法,打印出去除重复后List集合
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		
		getSingle(list);   
		System.out.println(list);
	}

	public static void getSingle(List<String> list) {
		LinkedHashSet<String> li = new LinkedHashSet<>();//创建一个set集合
		li.addAll(list);               //往li里面加入list的全部
		list.clear();                  //清空list
		list.addAll(li);              
	}

}
