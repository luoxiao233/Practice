package com.java.object;

import com.java.bean.Student;

public class Demo1_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = new Object();
		System.out.println(o.hashCode());   // ���ص��Ƕ���Ĺ�ϣ��ֵ�����ֵ���ù�����ĵ�ַ������ģ�����һ�������ͬһ������Ļ�����ô��ϣ��ֵ��һ���ġ�
		
		Student s =  new Student();
		System.out.println(s.hashCode());
	}

}
