package com.java.set;

import java.util.TreeSet;

import com.java.bean.Person;

public class Demo3_TreeSet {
	/*
	 * * A:案例演示
			* TreeSet存储Integer类型的元素并遍历
			  * TreeSet是用来对元素进行排序的,同样也可以保证元素的唯一
			  * 当实现Comparable,返回值是0时,集合中只有一个元素??
			  * 当实现Comparable,返回值是正数时,集合中的元素按照正序排序(怎么存,就怎么取)
			  * 当实现Comparable,返回值是负数时,集合中的元素按照倒序排列
			  * 
			  此代码中的Comparable方法指的是Person类中的方法
	 */
	public static void main (String[] args) {
//		demo1();
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("aaa", 20));
		ts.add(new Person("aaa", 21));
		ts.add(new Person("bbb", 20));
		ts.add(new Person("cccc", 20));
		ts.add(new Person("ddddd", 20));
		System.out.println(ts);
	}

	public static void demo1() {
		TreeSet<Person> s= new TreeSet<>();
		s.add(new Person("张三", 23));
		s.add(new Person("张4", 24));
		s.add(new Person("张5", 25));
		s.add(new Person("张6", 26));
		s.add(new Person("张7", 27));
		
		System.out.println(s);
	}
	

}
