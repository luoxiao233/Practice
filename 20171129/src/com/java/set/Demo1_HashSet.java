package com.java.set;

import java.util.HashSet;

import com.java.bean.Person;

public class Demo1_HashSet {
	/*
	 * * B:������ʾ
	 	* HashSet�洢�ַ���������
	 	* HashSet�ļ̳���ϵ��д��toString����
	 	* 
	 */
	public static void main(String[] args) {
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("����", 23));
		hs.add(new Person("����", 23));
		hs.add(new Person("��4", 24));
		hs.add(new Person("��4", 24));
		hs.add(new Person("��4", 24));
		hs.add(new Person("����", 23));
		
		System.out.println(hs);  //Person����д��HashCode()������Equals()��������ȥ���Զ�����ظ�
	}
}
