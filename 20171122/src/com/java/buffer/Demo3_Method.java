package com.java.buffer;

public class Demo3_Method {

	public static void main(String[] args) {
		/*
		 * StringBuffer��ɾ�����滻
		 */
		StringBuffer sb = new StringBuffer();
		sb.append("zheshizhendejiada");
		System.out.println(sb);
		sb.deleteCharAt(0);     //ɾ��0���������ַ�
		System.out.println(sb);
		sb.delete(0, 2);    // ɾ����0��1 ���������ַ�
		System.out.println(sb);
		sb.replace(0, 3, "wo");  //��wo ��� 0��1��2���������ַ�
		System.out.println(sb);
		System.out.println(sb.reverse());   //��ת����ַ���  ��String��û��������ܣ�
	}

}
