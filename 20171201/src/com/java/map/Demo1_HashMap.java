package com.java.map;

import java.util.HashMap;

import com.java.bean.Student;

public class Demo1_HashMap {
	/*
	 *  A:案例演示
	 	* HashMap集合键是Student值是String的案例
	 	* 双列集合存储,键是自定义类时,要重写hashCode方法和equals方法保证键的唯一
	 	* 
	 	* 底层是链表实现的可以保证怎么存就怎么取
	 */
	public static void main(String[] args){
		HashMap<Student, String> hm = new HashMap<>();
		hm.put(new Student("张4", 24), "b");
		hm.put(new Student("张5", 25), "be");
		hm.put(new Student("张6", 26), "bei");
		hm.put(new Student("张7", 27), "beij");
		hm.put(new Student("张三", 23), "beijing");
		System.out.println(hm);
	}

}
