package com.java.Test;

public class String1 {
	/*
	 * * A:������ʾ
	 	* ����:�����ַ���
	 */
	public static void main(String[] args) {
		String s = "nishuowo fanbufan";
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " ");
		}
		System.out.println();
		char[] arr = s.toCharArray();
		for (char c : arr) {
			System.out.print(c + " ");
		}
	}

}
