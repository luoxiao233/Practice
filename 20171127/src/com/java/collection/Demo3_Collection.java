package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.java.bean.Student;

public class Demo3_Collection {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
//		demo1();
		Collection c = new ArrayList(); 
		c.add(new Student("张三",23));  //Object obj = new Student("张三"，23);  向上转型
		c.add(new Student("张三",24));
		c.add(new Student("张三",25));
		c.add(new Student("张三",26));
		
		Object[] arr = c.toArray();   //将集合转为数组
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); //只是用来显示结果
			Student s = (Student)arr[i];    //向下转型
			System.out.println(s.getName() + s.getNum());//向下转型之后，其中的getName()和getNum()可以单独来出来使用
		}
	}

	static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("c");
	}

}
