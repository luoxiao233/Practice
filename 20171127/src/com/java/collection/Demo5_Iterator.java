package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.java.bean.Student;

public class Demo5_Iterator {

	public static void main(String[] args) {
//		demo1();
		Collection c = new ArrayList();
		c.add(new Student("张1",21));
		c.add(new Student("张2",22));
		c.add(new Student("张3",23));
		c.add(new Student("张4",23));
		Iterator it = c.iterator();
		while(it.hasNext()){
			Student s = (Student)it.next();
			System.out.println(s.getName() + "````" + s.getNum());
		}
	}

	static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		//使用迭代器遍历
		Iterator it = c.iterator();
		boolean b1 = it.hasNext();
		System.out.println(b1);
		Object obj1 = it.next();
		System.out.println(obj1);
		
		boolean b2 = it.hasNext();
		System.out.println(b2);
		Object obj2 = it.next();
		System.out.println(obj2);
		
		while(it.hasNext()){
			System.out.println(it.next());  
		}
	}

}
