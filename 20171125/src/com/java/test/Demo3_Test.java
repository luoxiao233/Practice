package com.java.test;

import java.util.Calendar;
import java.util.Scanner;

public class Demo3_Test {
/*
 * ����һ�������ж��ǲ�������
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ����");
		String line = sc.nextLine();      //���ַ���line�����������
		int year = Integer.parseInt(line);  //���ַ���line  תΪ  ����
		
		boolean b=  getYear(year);   //��getYear�������ж�
		System.out.println(b);
	}

	private static boolean getYear(int year) {
		Calendar c = Calendar.getInstance();      //���쵱ǰʱ������������ȫ��ʱ��
		c.set(year,2,1);                      //������������ʱ��Ϊ ����3��1��  ����ΪĬ�����Ǵ�0��ʼ��ģ�����Ϊ2��
		c.add(Calendar.DAY_OF_MONTH, -1);        // ��������ϼ�һ��  ��ô����2�µ����һ��
		
		return c.get(Calendar.DAY_OF_MONTH) == 29;
	}

}
