package com.java.reflect;

import java.lang.reflect.Constructor;

import com.java.bean.Person;

public class Demo3_Constructor {
	/*
	 * ͨ�������ȡ���ι��췽����ʹ��)
	* Constructor
		* Class���newInstance()������ʹ�ø����޲εĹ��캯����������, 
		* ���һ����û���޲εĹ��캯��, �Ͳ�������������,
		* ���Ե���Class���getConstructor(String.class,int.class)������ȡһ��ָ���Ĺ��캯��
		* Ȼ���ٵ���Constructor���newInstance("����",20)������������
	 */
	public static void main(String[] args) throws Exception {
		//1.�õ��ֽ������
		Class clazz = Class.forName("com.java.bean.Person");
		
		//2.��ȡ�����еĹ��췽��
		Constructor[] arr = clazz.getConstructors();
		for (Constructor constructor : arr) {
			System.out.println(constructor);
		}
		
		//3.ͨ���ֽ��������õ��вεĹ��췽��
		Constructor c = clazz.getConstructor(String.class,int.class);
		
		//4.ͨ���вι���������
		Person p = (Person) c.newInstance("����",23);
		System.out.println(p);
	}

}
