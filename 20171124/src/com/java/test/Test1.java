package com.java.test;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Test1 {

	public static void main(String[] args) throws Exception {      //��������׳��쳣�������º���Ҫ��
		/*
		 * 	* ������һ��������������������?

				/**
				 * * A:������ʾ
				 * ������һ��������������������?
				 * ����:
				 * 1,�������ַ����ͽ����ַ�������String���͵ı�����
				 * 2,�������ڸ�ʽ������
				 * 3,�������ַ���ת�������ڶ���
				 * 4,ͨ�����ڶ������ʱ�����ֵ
				 * 5,������ʱ�����ֵ�������1000,�ٳ���60,�ٳ���60,�ٳ���24�õ���
				 * @throws ParseException 
				 */
		String birth ="1994��08��09��";
		String today = "2017��11��24��";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		Date d1 = sdf.parse(birth);
		Date d2 = sdf.parse(today);
		long time = d2.getTime() - d1.getTime();
		System.out.println(time / 1000 / 60 / 60 / 24 );	
	}

}
