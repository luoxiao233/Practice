package com.java.object;

import com.java.bean.Student;

public class Demo4_Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("����",23);
		Student s2 = new Student("����",23);
		System.out.println(s1.equals(s2));     //ֱ�Ӵ����������ж������Ƿ���ȣ��޹ض���ĵ�ַ��ֻƾ���ݣ�
	}

}
