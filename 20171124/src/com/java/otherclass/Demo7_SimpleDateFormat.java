package com.java.otherclass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo7_SimpleDateFormat {

	public static void main(String[] args) {
		/*
		 * DateFormat�����ڻ���ʱ��ĳ����࣬һ����˵ʹ������
		 * SimpleDateFormat
		 */
//		demo1();
//		demo2();

		
	}

	static void demo2() {
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");//�������� ����
		String s = df.format(d);
		System.out.println(s);   // 2017��11��24�� 20:59:03 
	}

	static void demo1() {
		Date d = new Date();
		DateFormat df = new SimpleDateFormat();
		String s = df.format(d);
		System.out.println(s);      //17-11-24 ����8:57 (����Ĭ�ϵ�)
	}

}
