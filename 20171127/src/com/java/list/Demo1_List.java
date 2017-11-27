package com.java.list;

import java.util.ArrayList;
import java.util.List;

public class Demo1_List {
	/*
	 * * A:List集合的特有功能概述
			* void add(int index,E element)
			* E remove(int index)
			* E get(int index)
			* E set(int index,E element)
	 */
	public static void main(String[] args) {
//		demo1();
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(4,"e");          //在索引值为4的位置加入 e， 如果超出了集合的索引值，那么就是索引越界异常
		System.out.println(list);    
		
	}

	static void demo1() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println(list);
		list.add(1,"e");
		System.out.println(list);
	}

}
