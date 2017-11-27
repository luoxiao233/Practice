package com.java.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo3_ListIterator {
	/*
	 * * boolean hasNext()是否有下一个
			* boolean hasPrevious()是否有前一个
			* Object previous();返回上一个元素
			* cursor : 指针,光标
	 */
	public static void main(String[] args) {
		List list = new ArrayList();   //父类指向子类对象 
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");    //往集合里面加对象
		ListIterator lit = list.listIterator();  //使用迭代器  ListIterator是Iterator的接口
		while(lit.hasNext()){     //判断是否存在下一个元素
			System.out.println(lit.next());
		}
		while(lit.hasPrevious()){
			System.out.println(lit.previous());
		}
	}

}
