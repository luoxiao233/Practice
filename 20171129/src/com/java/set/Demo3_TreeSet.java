package com.java.set;

import java.util.TreeSet;

import com.java.bean.Person;

public class Demo3_TreeSet {
	/*
	 * * A:������ʾ
			* TreeSet�洢Integer���͵�Ԫ�ز�����
			  * TreeSet��������Ԫ�ؽ��������,ͬ��Ҳ���Ա�֤Ԫ�ص�Ψһ
			  * ��ʵ��Comparable,����ֵ��0ʱ,������ֻ��һ��Ԫ��??
			  * ��ʵ��Comparable,����ֵ������ʱ,�����е�Ԫ�ذ�����������(��ô��,����ôȡ)
			  * ��ʵ��Comparable,����ֵ�Ǹ���ʱ,�����е�Ԫ�ذ��յ�������
			  * 
			  �˴����е�Comparable����ָ����Person���еķ���
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
		s.add(new Person("����", 23));
		s.add(new Person("��4", 24));
		s.add(new Person("��5", 25));
		s.add(new Person("��6", 26));
		s.add(new Person("��7", 27));
		
		System.out.println(s);
	}
	

}
