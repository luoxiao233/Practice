package com.java.ragex;

public class Demo2_Regex {

	public static void main(String[] args) {
//		demo1();
		
		/*
		 * ��"�����ҡ���Ҫ����Ҫ��ҪҪҪ������ѧѧѧѧ���̳̳�" ��Ϊ "��Ҫѧ���"
		 */
		String s = "�����ҡ���Ҫ����Ҫ��ҪҪҪ������ѧѧѧѧ���̳̳�";
		String s1 = s.replaceAll("\\��", "");    // �ÿ��ַ����滻��
		System.out.println(s1);
		String regex = "(.)\\1+";          //������� �涨Ϊ һ���ַ������Ƕ���ַ�
		String s2 = s1.replaceAll("(.)\\1+", "$1");   // ���$1 �������.  Ҳ����������  �򵥵�˵����ȥ��
		System.out.println(s2);
	}

	static void demo1() {
		String s = "qweertyyyuioo";
		String regex = "(\\w)\\1+";
		String[] arr = s.split(regex);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
