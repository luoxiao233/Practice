package com.java.method;

public class Demo1_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "123456";
		String s2 = "12345";
		String s3 = "1234";
		String s4 = "123";
		String s5 = "12";
		String s6 = "1";
		String s7 = null;
		System.out.println(s1.equals(s2));       //�����������ȣ���Сд��
		System.out.println(s1.equalsIgnoreCase(s3));     //�����������ȣ����Դ�Сд��
		System.out.println(s1.contains(s4));      //�Ƿ�Ϊ������ϵ
		System.out.println(s1.startsWith(s5));      //�Ƿ�Ӵ˴���ʼ
		System.out.println(s1.endsWith(s6));      //�Ƿ�Ӵ˴�����
		System.out.println(s6.isEmpty());     //�ַ����Ƿ�Ϊ��
	}

}