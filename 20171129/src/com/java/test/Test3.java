package com.java.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Test3 {
	/*
	 * ����: �������е��ظ�Ԫ��ȥ��
	 * ����:
	 * 1.����һ��List����,�洢�����ظ�Ԫ��
	 * 2.���巽��,ȥ���ظ�
	 * 3.���÷���,��ӡ��ȥ���ظ���List����
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		
		getSingle(list);   
		System.out.println(list);
	}

	public static void getSingle(List<String> list) {
		LinkedHashSet<String> li = new LinkedHashSet<>();//����һ��set����
		li.addAll(list);               //��li�������list��ȫ��
		list.clear();                  //���list
		list.addAll(li);              
	}

}
