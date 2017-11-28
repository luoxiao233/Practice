package com.java.generic;

import java.util.ArrayList;
import java.util.Iterator;

import com.java.bean.Student;

public class Demo1_Generic {
	/*
	 * * A:���͸���
		* B:���ͺô�
			* ��߰�ȫ��(�������ڵĴ���ת����������) 
			* ʡȥǿת���鷳
		* C:���ͻ���ʹ��
			* <>�зŵı����������������� 
		* D:����ʹ��ע������
			* ǰ��ķ��ͱ���һ��,���ߺ���ķ��Ϳ���ʡ�Բ�д(1.7�����������η���) 
	 */
	public static void main(String[] args) {
//		demo1();
		ArrayList<Student> list = new ArrayList<>();   //����<Student>������صľ�ֻ����Student��
		list.add(new Student("����",23));
		list.add(new Student("��4",23));
		list.add(new Student("��5",25));
		list.add(new Student("��6",26));
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
