package com.java.jdk5;

public class Demo4_ChangeableArgs {
	/*
	 * * A:�ɱ��������
			* ���巽����ʱ��֪���ö�����ٸ�����
		* B:��ʽ
			* ���η� ����ֵ���� ������(�������͡�  ������){}
		* C:ע�����
			* ����ı�����ʵ��һ������
			* ���һ�������пɱ�����������ж����������ô���ɱ�����϶������һ��
	 */
	public static void main(String[] args) {
		int arr[] = {11,22,55,33,44};
		print(3,4,arr);
		
	}
	public static void print(int x,int y,int ... arr) {		//����ı�����ʵ��һ������
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
