package com.java.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1_ArrayList {
	/*
	 * 要求：去除ArratList中重复的
	 * 思路：创建集合方式
	 * 
	 * 去除重复元素的方法
	 * 返回值ArrayList
	 * 参数列表 ArrayList   List
	 * 
	分析：
	1.创建一个新集合
	2.遍历老集合
	3.判断新集合中是否包含老集合中的元素，如果不包含那么就添加到新集合中
	4.返回新集合
	 
	*/
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("c");
		ArrayList newList = getSingle(list);
		System.out.println(newList);
	}
	public static ArrayList getSingle(ArrayList list){
		ArrayList newList = new ArrayList();
		Iterator it = list.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			if (!newList.contains(obj)) {
				newList.add(obj);
			}
		}
		return newList;
	}

}
