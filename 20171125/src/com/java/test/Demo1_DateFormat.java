package com.java.test;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Demo1_DateFormat {
	/*
	 *  * ������һ��������������������?
			 * ����:
			 * 1,�������ַ����ͽ����ַ�������String���͵ı�����
			 * 2,�������ڸ�ʽ������
			 * 3,�������ַ���ת�������ڶ���
			 * 4,ͨ�����ڶ����ȡʱ�����ֵ
			 * 5,������ʱ�����ֵ�������1000,�ٳ���60,�ٳ���60,�ٳ���24�õ���
			 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		String s1 = "1994��08��09��";                     //�����Ȱ����պͼ������뵽String��
		String s2 = "2017��11��25��";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");  //��SimpleDateFormat �涨һ�����ʽ
		Date d1 = sdf.parse(s1);
		Date d2 = sdf.parse(s2);              //parse�������ǽ���һ���ı���Ȼ���Ϊ�涨��Date��ʽ
		long l1 = d1.getTime();
		long l2 = d2.getTime();           //�ֱ��ø����ĺ�����
		long time = l2 - l1;           //  ������������ ������
		System.out.println(time / 1000 / 60 / 60 / 24);  
	}

}
