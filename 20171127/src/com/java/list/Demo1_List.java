package com.java.list;

import java.util.ArrayList;
import java.util.List;

public class Demo1_List {
	/*
	 * * A:List���ϵ����й��ܸ���
			* void add(int index,E element)
			* E remove(int index)
			* E get(int index)
			* E set(int index,E element)
	 */
	public static void main(String[] args) {
//		demo1();
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(4,"e");          //������ֵΪ4��λ�ü��� e�� ��������˼��ϵ�����ֵ����ô��������Խ���쳣
		System.out.println(list);    
		
	}

	static void demo1() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println(list);
		list.add(1,"e");
		System.out.println(list);
	}

}
