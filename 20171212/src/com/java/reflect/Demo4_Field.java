package com.java.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.java.bean.Person;

public class Demo4_Field {
	/*
	 * ͨ�������ȡ��Ա������ʹ��) Field * Class.getField(String)�������Ի�ȡ���е�ָ���ֶ�(�ɼ���),
	 * �����˽�еĿ�����getDeclaedField("name")������ȡ,ͨ��set(obj, "����")������������ָ�������ϸ��ֶε�ֵ,
	 * �����˽�е���Ҫ�ȵ���setAccessible(true)���÷���Ȩ��,�û�ȡ��ָ�����ֶε���get(obj)���Ի�ȡָ�������и��ֶε�ֵ
	 */
	public static void main(String[] args) throws Exception {
		//1.��ȡ�ֽ������
		Class clazz = Class.forName("com.java.bean.Person");
		
		//2.ͨ���ֽ��������õ����������ù��췽�������¶���
		Constructor c = clazz.getConstructor(String.class,int.class);
		Person p = (Person) c.newInstance("����",23);
		System.out.println(p);
		
		//3.��Ҫǿ�иı�����е�ֵ
		
		Field f = clazz.getDeclaredField("name");//���������ȡ�ֶ�
		f.setAccessible(true);			//ȥ��˽��Ȩ��
		f.set(p, "����");
		System.out.println(p);
	}

}
