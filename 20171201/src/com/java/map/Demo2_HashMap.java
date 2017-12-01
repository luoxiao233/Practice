package com.java.map;

import java.util.Comparator;
import java.util.TreeMap;

import com.java.bean.Student;

public class Demo2_HashMap {
/*
 * ��TreeMap��������γ�һ�����ϣ����TreeMap��TreeSet���ǿ�������ģ�Ҳ�ǿ����ñȽ����ġ�
 */
	public static void main(String[] args) {
		TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int num = o2.getAge() - o1.getAge();
				return num == 0 ? o2.getName().compareTo(o1.getName()):num;
			}
		});
		tm.put(new Student("����", 23), "b");
		tm.put(new Student("��4", 24), "be");
		tm.put(new Student("��5", 25), "bei");
		tm.put(new Student("��6", 26), "beij");
		tm.put(new Student("��7", 27), "beijing");
		
		System.out.println(tm);
	}

}
