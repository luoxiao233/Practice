package com.java.test;

public class Test2_Args {

	public static void main(String[] args) {
		String s = "haha";
		System.out.println(s);   //haha
		change(s);              //������ջ�������һ�б�Ϊ����
		System.out.println(s);  //haha   ���Ի��Ǵ�ӡ����haha
		
		StringBuffer sb = new StringBuffer("123");
		System.out.println(sb);    //123
		change(sb);					//ֻ��һ��������
		System.out.println(sb);    //123123
	}

	public static void change(String s) {
		s += "123";
	}
	public static void change(StringBuffer sb) {
		sb.append("123");
	}

}
