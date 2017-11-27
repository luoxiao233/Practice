package com.java.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo2_List {
/*
 * 从元素合集中查找出world，并且在它后面加上javaee
 */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("world");
		list.add("d");
		list.add("e");
		list.add("f");       //向合集里面添加元素，元素索引按照添加顺序排列
		ListIterator lit = list.listIterator();    //获取迭代器，这是list特有的 ////listIterator是Iterator的子接口
		while (lit.hasNext()) {          //遍历，hasNext()是Iterator中的方法，作用是判断集合中是否有元素
			Object obj = lit.next();     //集合中元素偶是用 对象来接收的
			if ("world".equals(obj)) {
				lit.add("javaee");
			}
		}
		System.out.println(list);
	}

}
