package com.java.Test;

import java.util.Arrays;

public class String4 {
	/*
	 * * A:������ʾ
			* ����:�������е����ݰ���ָ����ʽƴ�ӳ�һ���ַ���
				* ����:
					* int[] arr = {1,2,3};
				* ������:
					* "[1, 2, 3]"
	*/
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		String s = Arrays.toString(arr);
		char[] arr1 = s.toCharArray();
		System.out.println(s);
		System.out.println(arr1);
		
		
		
		
		
		String s3 = arr.toString();
		String s2 = String.valueOf(arr);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(String.valueOf((byte)5));
		System.out.println(String.valueOf((short)5));
		System.out.println(String.valueOf((int)5));
		System.out.println(String.valueOf('5'));
		System.out.println(String.valueOf((float)11.5));
		System.out.println(String.valueOf((double)5.5));
		System.out.println(String.valueOf((long)5));
		
	}

}
