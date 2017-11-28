package com.java.list;

import java.util.ArrayList;
import java.util.Iterator;

import com.java.bean.Student;

public class Demo2_ArrayList {
/*
 * 删除集合中重复的元素
 */
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("张三",23));
		list.add(new Student("张三",23));
		list.add(new Student("张4",24));
		list.add(new Student("张4",24));
		list.add(new Student("张4",24));
		ArrayList newList = getSingle(list);
		System.out.println(newList);   
		//这个位置如果Student类没有重写toString 那么只会打印出地址值
		//这个位置如果Student类没有重写equals方法，那么 重复的也会被打印出来
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
