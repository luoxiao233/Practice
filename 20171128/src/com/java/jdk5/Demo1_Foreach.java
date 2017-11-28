package com.java.jdk5;

import java.util.ArrayList;

import com.java.bean.Person;

public class Demo1_Foreach {
/*
 * ��ǿfor����
 */
	public static void main(String[] args) {
//		demo1();
//		demo2();
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("����", 23));
		list.add(new Person("��4", 24));
		list.add(new Person("��5", 25));
		list.add(new Person("��6", 26));
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
		
		for(String str:list){      //foreach�ײ��ǵ����������������õ����Ҳ����
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
