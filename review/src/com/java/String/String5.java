package com.java.String;

public class String5 {
/*
 * 	/*
	 * * A:������ʾ
			* ����:���ַ�����ת
				* ����:����¼��"abc"
				* ������"cba"
				* 
 */
	public static void main(String[] args) {
		String s = "abc";
		StringBuilder sb = new StringBuilder(s);
		
		/*���ֻ��������reverse����������StringBuiler��StringBuffer��Collections����תԪ��˳��
		 * 
		* StringBuffer��StringBuilder������
		* StringBuffer��1.0�̰߳�ȫ�ģ�Ч����
		* StringBuilder��1.5�̲߳���ȫ�ģ�Ч�ʿ�
		*/
		sb.reverse();
		System.out.println(sb);
	}

}
