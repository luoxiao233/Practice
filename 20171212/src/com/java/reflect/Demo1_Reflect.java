package com.java.reflect;

import com.java.bean.Person;
/*
 * ��ȡclass�ļ���������ַ�ʽ
 */
public class Demo1_Reflect {

	public static void main(String[] args) throws Exception {
		//1.��Class���Դ��ľ�̬����forName
		Class clazz = Class.forName("com.java.bean.Person");
		
		//2.����֪��������£�֮��������.class �õ�
		Class clazz1 = Person.class;
		
		//3.��������ʹ�ö����е�getClass()����
		Person p = new Person();
		Class clazz2 = p.getClass();
		
		System.out.println(clazz == clazz1);
		System.out.println(clazz1 == clazz2);
		
	}

}
