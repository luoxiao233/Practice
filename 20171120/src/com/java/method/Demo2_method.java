package com.java.method;

public class Demo2_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "010234567890";
		String s1 = "��һ�����������߰˾Ŷ�";
//		System.out.println(s.length());          //�ַ�������
//		System.out.println(s1.charAt(5));        // �ַ���������5����ʾ����
//		System.out.println(s1.indexOf("��"));     //�ַ����� �� ������ֵΪ����
//		System.out.println(s.indexOf("12"));     //����12����Ҫλ��
		System.out.println(s.indexOf('0', 4));    //���Ҫ��ѯ0������ ������ֵ4��ʼ���Ҳ��ҳ����ĵ�һ��
		System.out.println(s1.indexOf('��', 3));
		System.out.println(s1.lastIndexOf('һ'));   //���ҿ�ʼ�������
	}

}
