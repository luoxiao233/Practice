package com.java.set;

import java.util.LinkedHashSet;

public class Demo2_LinkedHashSet {
	/*
	 * * B:������ʾ
			* LinkedHashSet���ص�
				* ���Ա�֤��ô�����ôȡ 
				* 1.�ײ�������ʵ�ֵ�,��Set������Ψһһ���ܱ�֤��ô�����ôȡ�ļ��϶���
			 	* 2.��Ϊ��HashSet������,����Ҳ��֤��Ԫ����Ψһ��,��HashSet��ԭ��һ��
	 */	
	public static void main(String[] args){
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("c");
		lhs.add("b");
		lhs.add("d");
		lhs.add("d");
		lhs.add("d");
		lhs.add("g");
		lhs.add("h");
		System.out.println(lhs);  //[c, b, d, g, h]��ȫ�ǰ��մ�ȡ��˳���ӡ�����ģ���ȥ�ظ��ģ�
	}
	
}
