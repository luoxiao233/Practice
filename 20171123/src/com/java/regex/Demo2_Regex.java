package com.java.regex;

public class Demo2_Regex {

	public static void main(String[] args) {
		/*�ַ��� 
			[abc] a��b �� c�����ࣩ 
			[^abc] �κ��ַ������� a��b �� c���񶨣� 
			[a-zA-Z] a �� z �� A �� Z����ͷ����ĸ�������ڣ���Χ�� 
			[a-d[m-p]] a �� d �� m �� p��[a-dm-p]�������� 
			[a-z&&[def]] d��e �� f�������� 
			[a-z&&[^bc]] a �� z������ b �� c��[ad-z]����ȥ�� 
			[a-z&&[^m-p]] a �� z������ m �� p��[a-lq-z]����ȥ��*/
//		demo1(); 
//		demo2();
	}

	static void demo2() {
		String regex = "[^abc]"; //���ʾֻ��ͨ��һ���ַ���������ַ�ֻҪ����a,b,c����һ������
		System.out.println("d".matches(regex));
		System.out.println("a".matches(regex));
	}

	static void demo1() {
		String regex = "[abc]";          //�������ʾֻ��ͨ��һ���ַ���������ַ�ֻ����a,b,c����һ��
		System.out.println("a".matches(regex));
		System.out.println("ab".matches(regex));
	}

}
