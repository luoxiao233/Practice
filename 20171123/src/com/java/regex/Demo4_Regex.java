package com.java.regex;

public class Demo4_Regex {

	public static void main(String[] args) {
		/*
		 * Greedy ������ 
			X? X��һ�λ�һ��Ҳû�� 
			X* X����λ��� (����һ��)
			X+ X��һ�λ��� 
			X{n} X��ǡ�� n �� 
			X{n,} X������ n �� 
			X{n,m} X������ n �Σ����ǲ����� m ��
		 */
		String regex = "[abcd]?";
		String regex1 = "[abcd]*";
		String regex2 = "[abcd]{4,}";
		System.out.println("".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("e".matches(regex));
		
		System.out.println(" ".matches(regex1));
		System.out.println("e".matches(regex1));
		System.out.println("abcd".matches(regex2));
	}

}
