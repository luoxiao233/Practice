package com.java.collection;

import com.java.bean.Student;

public class Demo1_Collection {
	/*
	 * * A:案例演示
	 	* 需求：我有5个学生，请把这个5个学生的信息存储到数组中，并遍历数组，获取得到每一个学生信息。
	 	* 
	 	* 基本数据类型的值传递:值
	 	* 引用数据类型的值传递:地址值
	 	* 一旦重写了toString()方法,比较的属性值
	 */
	public static void main(String[] args) {
		Student []arr = new Student[5];     //简历一个学生数组对象  规定里面有5个元素
		arr[0] = new Student("张yi",21);      //对索引值为0的元素进行赋值
		arr[1] = new Student("张we",22);
		arr[2] = new Student("张san",23);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
