package com.java.test;

import java.util.HashSet;
import java.util.Scanner;

public class Test2 {
	/*
	 *  ʹ��Scanner�Ӽ��̶�ȡһ������,ȥ�������ظ��ַ�, ��ӡ����ͬ����Щ�ַ�
	 		* aaaabbbcccddd
	 		* 
	 	����:
	 	1.����¼��,��Scanner
	 	2.ȥ���ظ��ַ�,����Set����
	 	3.��nextLine��������,���ַ���ת�����ַ�������,
	 	4.��������,�洢��Set������,�Զ�ȥ���ظ�
	 	5.��������,��ӡ����ͬ���ַ�
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����");
		String s = sc.nextLine();
		String[] arr = s.split("");          //�ÿ��ַ����ָ���s  �õ�����
		HashSet<String> hs = new HashSet<>();
//		for (int i = 0; i < arr.length; i++) {
//			hs.add(arr[i]);
//		}   ���ֺ�����������һ����
		for (String String : arr) {
			hs.add(String);
		}

		for (String string : hs) {
			System.out.print(string);
		}
	}

}
