package com.java.test;

import java.util.Calendar;

public class Demo2_Calendar {
/*
 * Calendar������Ϊ���ڣ�����ͬYEAR,MONTH,DAY_OF_MONTH,HOUR������
 */
	public static void main(String[] args) {
//		demo1();//Calendar�Ļ����÷�
		Calendar c = Calendar.getInstance();      //����������������������ڵ�ʱ��
		c.add(Calendar.YEAR, 3);         //YEAR=2017 + 3 = 2020
		System.out.println(c);   //��ӡ��������һ��������ʵ�����˶����еĺܶ�ֵ������MONTH=10,WEEK_OF_YEAR=47,WEEK_OF_MONTH=4,DAY_OF_MONTH=25����
		c.set(2008, 7, 8);	 //��Ĭ�϶����е������� �޸�ΪYEAR=2008  MONTH=6  DAY_OF_MONTH=8   
	}

	static void demo1() {
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));      //2017
		System.out.println(c.get(Calendar.MONTH));   //Ĭ�ϴ�0��ʼ�����ֵΪ11
		System.out.println(c.get(Calendar.DAY_OF_MONTH));   // 25
		System.out.println(c.get(Calendar.DAY_OF_WEEK));  // Ĭ�ϴ����տ�ʼ����Ϊ1�� ���ֵΪ7��������
	}

}
