package com.java.jdk5;

import java.util.ArrayList;

import com.java.bean.Student;

public class Demo5_ArrayListArrayList {

	public static void main(String[] args) {
		ArrayList<ArrayList<Student>> list = new ArrayList<>();
		ArrayList<Student> g1 = new ArrayList<>();
		ArrayList<Student> g2 = new ArrayList<>();
		g1.add(new Student("��3", 23));
		g1.add(new Student("��4", 24));
		g1.add(new Student("��5", 25));
		g2.add(new Student("��6", 26));
		g2.add(new Student("��7", 27));
		g2.add(new Student("��8", 28));
		g1.add(new Student("jackay", 12));
		g2.add(new Student("jackay", 12));
		
		list.add(g1);
		list.add(g2);
		
		for (ArrayList<Student> g : list) {
			for (Student s : g) {
				System.out.println(s);
			}
		}
	}

}
