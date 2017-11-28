package com.java.list;

import java.util.LinkedList;

public class Demo3_LinkedList {
/*
 * LinkedList
 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst("a");
		list.addFirst("b");
		list.addFirst("c");
		list.addFirst("d");
		System.out.println(list); //打印出来的是[d, c, b, a]
		
		list.removeLast();    //删除最后一个
		System.out.println(list);  //打印出来[d, c, b]
	}

}
