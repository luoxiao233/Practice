package com.java.collection;

import com.java.bean.Student;

public class Demo1_Collection {
	/*
	 * * A:������ʾ
	 	* ��������5��ѧ����������5��ѧ������Ϣ�洢�������У����������飬��ȡ�õ�ÿһ��ѧ����Ϣ��
	 	* 
	 	* �����������͵�ֵ����:ֵ
	 	* �����������͵�ֵ����:��ֵַ
	 	* һ����д��toString()����,�Ƚϵ�����ֵ
	 */
	public static void main(String[] args) {
		Student []arr = new Student[5];     //����һ��ѧ���������  �涨������5��Ԫ��
		arr[0] = new Student("��yi",21);      //������ֵΪ0��Ԫ�ؽ��и�ֵ
		arr[1] = new Student("��we",22);
		arr[2] = new Student("��san",23);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
