package com.java.ragex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo3_Regex {

	public static void main(String[] args) {
		/*
		 * ȡ��"�ֻ���13456789231,haiyou15345678909"������ֻ�����
		 */
		String s = "�ֻ���13456789231,haiyou15345678909";
		String regex = "1[3,5]\\d{9}";   //������򣺵�һλΪ1���ڶ�λΪ3����5��\\d{9}��ʾ�����9�����֡�
		Pattern p = Pattern.compile(regex);   //��ȡ��Pattern����     compile ����
		Matcher m = p.matcher(s);		//��ƥ����
		while (m.find()) {          //����ҵ�ƥ����ַ���
			System.out.println(m.group());    //��group()������ȡ����
		}
	}

}
