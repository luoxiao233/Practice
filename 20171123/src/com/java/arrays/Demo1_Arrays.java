package com.java.arrays;

import java.util.Arrays;

public class Demo1_Arrays {
	/*
	 * Arrays ��������Ҫ������
	 * Arrays.toString() ����ָ���������ݵ��ַ�����ʾ��ʽ��(������Ϊ����)
	 * Arrays.sort() ����ָ���Ƚ���������˳���ָ�����������ָ����Χ��������(������Ϊ����)
	 * Arrays.binarySearch() ʹ�ö���������������ָ�����飬�Ի��ָ����ֵ(������Ϊ��������)
	 */

	public static void main(String[] args){
//		demo1();
//		demo2();
		int[] arr = {0,1,2,3,4,5,6,7,8};
		int i = Arrays.binarySearch(arr, 4);  //������������ж��ַ���������ֵ
		System.out.println(i);
	}

	static void demo2() {
		int[] arr = {11,33,22,44,55};
		Arrays.sort(arr);        // �����������������
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static void demo1() {
		int[] arr = {11,22,33};
		String s = Arrays.toString(arr);  //���������� ת��Ϊ�����ַ���
		System.out.println(s);
	}
}
