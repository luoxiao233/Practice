package com.java.string;

public class Demo1_Method {

	public static void main(String[] args) {
//		Demo1();
//		Demo2();
//		Demo3();
//		Demo4();
//		Demo5();
	}

	static void Demo5() {
		char[] arr = {'a','b','c','d'};
		String s = String.valueOf(arr);    
		//���ַ�����ת��Ϊ�ַ���       �˴���String.valueOf()�������κζ���������ֱ��ת��Ϊ�ַ���
		System.out.println(s);
	}

	static void Demo4() {
		String s= "xixihaha";
		char[] arr = s.toCharArray();           //���ַ��� ת��Ϊ �ַ�����
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static void Demo3() {
		int[] arr = {1,2,3,4};
		String s = "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				s = s + arr[i] + "]";
			}else
				s = s + arr[i] + ", ";
		}
		System.out.println(s);        //�õ�[1, 2, 3, 4] 
	}

	static void Demo2() {
		/*
		 * ��Ҫ�õ���ͷ��д��Ӣ��
		 */
		String s = "woxiangJingJing";
		//String s2= s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase());
		System.out.println(s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase()));
		//��ȡ�ַ�����һλʹ������дȻ��ƴ��   ��ȡ��һλ�������ĸʹ��Сд   �õ�
	}

	static void Demo1() {
		String s = "abc";
		byte[] arr = s.getBytes();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String s2 = "������";
		byte[] arr2 = s2.getBytes();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		String s3 = "�i";
		byte[] arr3 = s3.getBytes();                //���ַ���ת��Ϊ�ַ�����
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}

}
