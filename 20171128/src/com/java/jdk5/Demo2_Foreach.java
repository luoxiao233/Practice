package com.java.jdk5;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2_Foreach {
/*
 * (三种迭代的是否能够删除)
 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		
//		demo1(list);
//		demo2(list);
		
//		demo3(list);
		demo4(list);
		
		System.out.println(list);
	}

public static void demo4(ArrayList<String> list) {
	for (String string : list) {
		if ("b".equals(string)) {
			list.remove("b");    //同样是 并发修改异常，因为底层是迭代器原理
		}
	}
}

public static void demo3(ArrayList<String> list) {
	//		使用迭代器来迭代删除
			Iterator<String> it = list.iterator(); //获取迭代器
			while(it.hasNext()){
				String s = it.next();
				if ("b".equals(s)) {
					list.remove("b");   //这样会并发修改异常
					it.remove();
				}
			}
}

public static void demo2(ArrayList<String> list) {
	for (int i = 0; i < list.size(); i++) {
		if ("b".contains("b")) {
			list.remove("b");
		}
	}
}

public static void demo1(ArrayList<String> list) {
	//使用普通for循环来删除,索引要--
	for (int i = 0; i < list.size(); i++) {
		if ("b".equals(list.get(i))) {
			list.remove("b");
			i--;
		}
	}
}
}
