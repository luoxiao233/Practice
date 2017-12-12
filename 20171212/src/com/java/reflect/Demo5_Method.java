package com.java.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.java.bean.Person;

public class Demo5_Method {
	/*
	 * Method 
	 * Class.getMethod(String, Class...) ��
	 * Class.getDeclaredMethod(String, Class...)�������Ի�ȡ���е�ָ������,����invoke(Object,
	 * Object...)���Ե��ø÷���,Class.getMethod("eat") invoke(obj)
	 * Class.getMethod("eat",int.class) invoke(obj,10)
	 */
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.java.bean.Person");
		Constructor c = clazz.getConstructor(String.class,int.class);
		Person p = (Person) c.newInstance("����",23);
		Method[] arr = clazz.getMethods();
		for (Method method : arr) {
			System.out.println(method);
		}
		
		//ͨ���ֽ�������ȡ��ԭ���ķ���
		Method m = clazz.getMethod("haha");
		//�����������
		m.invoke(p);
	}

}
