package com.java.list;

import java.util.LinkedList;

public class Demo4_LinkedList {
	/*
	 * * A:案例演示
			* 需求：请用LinkedList模拟栈数据结构的集合，并测试 : 先进后出
			* 创建一个类将LinkedList中的方法封装 : Stack
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Stack s = new Stack();
		s.in("a");
		s.in("b");
		s.in("c");
		s.in("d");
		while(!s.isEmpty()) {
			System.out.println(s.out());
		}
	}

}
