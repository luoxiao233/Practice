package com.java.settest;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test2 {
	/*
	 * �Ӽ��̽���һ���ַ���, ��������������ַ���������,�����������: helloitcast�����ӡ:acehillostt
	 * ����:
	 * 1.���̽���Scanner
	 * 2.��������,�������ظ�:����TreeSet����,�ڹ��췽���д���Ƚ���,��дcompare����,�÷���ֵ�Ƿ�0����
	 * 3.�����յ��ַ���ת�����ַ�����
	 * 4.�����ַ�����,�������е�ÿһ��Ԫ�����Set����,
	 * 5.����Set����,�������ź����ұ����ظ���Ԫ�����
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����");
		TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {
				int num = o1.compareTo(o2);
				return num == 0 ? 1 : num;
			}
		});
		String line = sc.nextLine();
		char[] arr = line.toCharArray();
		for (char c : arr) {
			ts.add(c);
		}
		for (Character c : ts) {
			System.out.print(c);
		}
	}

}
