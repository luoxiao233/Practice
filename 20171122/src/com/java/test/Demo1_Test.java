package com.java.test;

public class Demo1_Test {

	public static void main(String[] args) {
		/*
		 * * A:������ʾ
			* ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
			* 
					������
						int[] arr = {1,2,3};	
					��������
						"[1, 2, 3]"
						
					��StringBuffer�Ĺ���ʵ��
		 */
		int[] arr = {1,2,3,4};
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				sb.append(arr[i]);
				sb.append("]");
			}else{
				sb.append(arr[i]);
				sb.append(",");
			}
		}
		System.out.println(sb);
	}

}
