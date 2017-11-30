package com.java.settest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Test1 {
	/*
	 *  ��һ�������д洢���������ظ����ַ���,����һ������,��������(�ֵ�˳��),���һ�����ȥ���ظ�
	 *  ����:
	 *  1.�ڼ����д洢�������ظ����ַ���,����һ��List����
	 *  2.����һ������,���������ұ����ظ�
	 *  3.��ӡ���List
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("bbb");
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("rrrrrr");
		list.add("wer");
		
		sort(list);
		System.out.println(list);
	}

	public static void sort(List<String> list) {
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int num = o1.compareTo(o2);
				return num == 0 ? 1 : num;
			}
			
		});
		ts.addAll(list);
		list.clear();
		list.addAll(ts);
	}

}
