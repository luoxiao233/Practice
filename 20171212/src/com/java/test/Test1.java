package com.java.test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test1 {
/*
 * ͨ������Խ�����ͼ�飺���Ͳ���/���ͷ���
 * ԭ����Ϊ����ֻ�ڱ�������Ч��ֻ����������﷨����ģ�
 */
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(111);
		list.add(222);
		
		//��ȡ�ֽ������
		Class clazz = Class.forName("java.util.ArrayList");
		Method m = clazz.getDeclaredMethod("add", Object.class);
		m.setAccessible(true);
		m.invoke(list, "abc");
		System.out.println(list);
	}

}
