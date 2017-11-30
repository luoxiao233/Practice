package com.java.settest;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import com.java.bean.Student;

public class Test4 {
	/*
	 * * A:案例演示
	 	* 需求：键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台。
	 	* 1.键盘录入Scanner对象
	 	* 2.创建TreeSet集合,传入比较器(按照总分从高到低输出到控制台)
	 	* 3.键盘录入5个学生信息可以作为判断条件 : while(ts.size < 5)
	 	* 4.用字符串接收键盘录入的学生信息(姓名,语文成绩,数学成绩,英语成绩),用正则表达式进行切割,返回字符串数组
	 	* 5.将字符串数组中的切割好的字符串转换成int数,把这些信息封装成学生类对象,将学生类对象添加TreeSet集合中
	 	* 6.遍历输出每一个学生对象即可
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入");
		
		
		TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int num = o2.getSum() - o1.getSum();
				return num == 0 ? 1:num;
			}
		});
		while (ts.size() < 5) {
			String s= sc.nextLine();
			String[] arr = s.split(",");
			int[] arr1 = new int[3];
			try {
				for (int i = 1; i < arr.length; i++) {
					arr1[i-1] = Integer.parseInt(arr[i]);
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("输的不对");
			}
			ts.add(new Student(arr[0], arr1[0], arr1[1], arr1[2]));
		}
		for (Student st : ts) {
			System.out.println(st);
		}
		
	}

}
