package com.java.buffer;

public class Demo4_Method {

	public static void main(String[] args) {
		/*
		 * StringBuffer�Ľ�ȡ
		 */
		StringBuffer sb = new StringBuffer();
		sb.append("woxiangjingjing");
		
		String s = sb.substring(7);			//ѡȡ   ����ֵ>=7   ���ַ�
		System.out.println(s);				//�õ�jingjing
		
		String s2 = sb.substring(2,7);		//ѡȡ    2<=����ֵ<7   ���ַ�
		System.out.println(s2);
	}

}
