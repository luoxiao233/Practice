package com.java.regex;

public class Demo3_Regex {

	public static void main(String[] args) {
		/*Ԥ�����ַ��� 
			. �κ��ַ� 
			\d ���֣�[0-9] 
			\D �����֣� [^0-9] 
			\s �հ��ַ���[ \t\n\x0B\f\r] 	
			\S �ǿհ��ַ���[^\s] 
			\w �����ַ���[a-zA-Z_0-9] 
			\W �ǵ����ַ���[^\w]*/
//		demo1();
//		demo2();
		
		
	}

	static void demo2() {
		String regex = "\\w";    //һ���ַ��� ��ֻ����[a-zA-Z_0-9]֮���
		System.out.println(" ".matches(regex));
		System.out.println("a".matches(regex));
	}

	static void demo1() {
		String regex = ".";       //��ʾ���� �ܹ�ͨ�����һ���ַ��������գ�
		System.out.println(" ".matches(regex));
	}
}
