package com.java.map;

import java.util.Comparator;
import java.util.TreeMap;

import com.java.bean.Student;

public class Demo2_HashMap {
/*
 * 用TreeMap来存对象形成一个集合，这个TreeMap和TreeSet都是可以排序的，也是可以用比较器的。
 */
	public static void main(String[] args) {
		TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int num = o2.getAge() - o1.getAge();
				return num == 0 ? o2.getName().compareTo(o1.getName()):num;
			}
		});
		tm.put(new Student("张三", 23), "b");
		tm.put(new Student("张4", 24), "be");
		tm.put(new Student("张5", 25), "bei");
		tm.put(new Student("张6", 26), "beij");
		tm.put(new Student("张7", 27), "beijing");
		
		System.out.println(tm);
	}

}
