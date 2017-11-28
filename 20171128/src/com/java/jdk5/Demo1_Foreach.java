package com.java.jdk5;

import java.util.ArrayList;

import com.java.bean.Person;

public class Demo1_Foreach {
/*
 * 增强for概述
 */
	public static void main(String[] args) {
//		demo1();
//		demo2();
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("张三", 23));
		list.add(new Person("张4", 24));
		list.add(new Person("张5", 25));
		list.add(new Person("张6", 26));
		for (Person person : list) {
			System.out.println(person);
		}
	}

	static void demo2() {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		for(String str:list){      //foreach底层是迭代器，迭代器能用的这个也能用
			System.out.println(str);
		}
	}

	static void demo1() {
		int[] arr = {11,22,33,44,55};
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
