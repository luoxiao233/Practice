package com.java.string;

public class Demo2_Method {

	public static void main(String[] args) {
		/*
		 * 1.String���滻
		 * 2.String��ȥ�ո�
		 * 3.String�ַ���֮��ıȽ�
		 */
//		Demo1();
//		Demo2();
		String s = "��";
		String s1= "��";
		String s2 = "����";
		System.out.println('��');
		System.out.println('��');
		System.out.println('��' + 0);      //��������ʱ��Ϊunicode
		System.out.println('��' + 0);
		System.out.println(s.compareToIgnoreCase(s1));  //��ʾ�ľ�������unicode���
		
	}

	static void Demo2() {
		String s = "  ���� ʲô    ";
		System.out.println(s.trim());    //���������ȥ���������ߵĿո�
	}

	static void Demo1() {
		String s = "haha";
		System.out.println(s.replace("a", "e"));
		System.out.println(s.replace("hah","nen"));
	}

}
