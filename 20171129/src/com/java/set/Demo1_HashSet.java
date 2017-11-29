package com.java.set;

import java.util.HashSet;

import com.java.bean.Person;

public class Demo1_HashSet {
	/*
	 * * B:案例演示
	 	* HashSet存储字符串并遍历
	 	* HashSet的继承体系重写了toString方法
	 	* 
	 */
	public static void main(String[] args) {
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("张三", 23));
		hs.add(new Person("张三", 23));
		hs.add(new Person("张4", 24));
		hs.add(new Person("张4", 24));
		hs.add(new Person("张4", 24));
		hs.add(new Person("张三", 23));
		
		System.out.println(hs);  //Person中重写了HashCode()方法和Equals()方法才能去掉自定义的重复
	}
}
