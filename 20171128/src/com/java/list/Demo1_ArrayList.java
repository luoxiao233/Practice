package com.java.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1_ArrayList {
	/*
	 * Ҫ��ȥ��ArratList���ظ���
	 * ˼·���������Ϸ�ʽ
	 * 
	 * ȥ���ظ�Ԫ�صķ���
	 * ����ֵArrayList
	 * �����б� ArrayList   List
	 * 
	������
	1.����һ���¼���
	2.�����ϼ���
	3.�ж��¼������Ƿ�����ϼ����е�Ԫ�أ������������ô����ӵ��¼�����
	4.�����¼���
	 
	*/
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("c");
		ArrayList newList = getSingle(list);
		System.out.println(newList);
	}
	public static ArrayList getSingle(ArrayList list){
		ArrayList newList = new ArrayList();
		Iterator it = list.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			if (!newList.contains(obj)) {
				newList.add(obj);
			}
		}
		return newList;
	}

}
