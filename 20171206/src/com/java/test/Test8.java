package com.java.test;

public class Test8 {
/*
 * ��1000��  �����ж��ٸ���
 * ������
 * ��1000��������ֽ�������        ��ô������1000��������
 * 5�ı����������  �ص㣺�������к���1��5�����1��0  ����2��5�ܲ���2��0  ����3���ܲ���3��0  ����4���ܲ���4��0
 * ��ô�����к�0��5�����0��0
 */
	public static void main(String[] args) {
		System.out.println(fun(1000));
	}
	public static int fun(int num){
		if(num >= 0 && num <= 4){
			return 0;
		}else{
			return num/5 + fun(num/5);
		}
	}
}
