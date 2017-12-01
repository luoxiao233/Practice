package com.java.map;

import java.util.HashMap;

import com.java.bean.Student;

public class demo3_HashMapHashMap {
/*
 * HashMap�������󣬶����ֵΪHashMap
 */
	public static void main(String[] args) {
		HashMap<Student, String> hm88 = new HashMap<>();
		hm88.put(new Student("����", 23), "b");
		hm88.put(new Student("��4", 24), "be");
		hm88.put(new Student("��5", 25), "bei");
		hm88.put(new Student("��6", 26), "beij");
		
		HashMap<Student, String> hm99 = new HashMap<>();
		hm99.put(new Student("����", 23), "ch");
		hm99.put(new Student("��4", 24), "chong");
		hm99.put(new Student("��5", 25), "chongq");
		hm99.put(new Student("��6", 26), "chongqing");
		
		HashMap<HashMap<Student, String>, String> hm = new HashMap<>();
		hm.put(hm88, "1");
		hm.put(hm99, "2");
		
		for (HashMap<Student, String> h : hm.keySet()) {
			String value1 = hm.get(h);
			for (Student key : h.keySet()) {
				String value2 = h.get(key);
				
				System.out.println(key + "=" + value2 + "=" + value1);
			}
		}
	}

}
