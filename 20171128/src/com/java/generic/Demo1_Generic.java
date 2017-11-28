package com.java.generic;

import java.util.ArrayList;
import java.util.Iterator;

import com.java.bean.Student;

public class Demo1_Generic {
	/*
	 * * A:泛型概述
		* B:泛型好处
			* 提高安全性(将运行期的错误转换到编译期) 
			* 省去强转的麻烦
		* C:泛型基本使用
			* <>中放的必须是引用数据类型 
		* D:泛型使用注意事项
			* 前后的泛型必须一致,或者后面的泛型可以省略不写(1.7的新特性菱形泛型) 
	 */
	public static void main(String[] args) {
//		demo1();
		ArrayList<Student> list = new ArrayList<>();   //用了<Student>后面相关的就只能用Student类
		list.add(new Student("张三",23));
		list.add(new Student("张4",23));
		list.add(new Student("张5",25));
		list.add(new Student("张6",26));
		Iterator<Student> it = list.iterator();
		while(it.hasNext()){
			Student s = it.next();
			System.out.println(s.getName() + " " + s.getNum());
		}
	}

	static void demo1() {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
