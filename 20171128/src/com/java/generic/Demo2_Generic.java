package com.java.generic;

import java.util.ArrayList;
import java.util.Iterator;

import com.java.bean.Student;

public class Demo2_Generic {
	/*
	 * ArrayList存储字符串和自定义对象并遍历泛型版
	 */
	public static void main(String[] args) {
//		demo1();
		
//		demo2();
	}

	public static void demo2() {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("张三", 23));
		list.add(new Student("张4", 24));
		list.add(new Student("张5", 25));
		list.add(new Student("张6", 26));
		
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getName() + "..." + s.getNum());
		}
	}

	public static void demo1() {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
