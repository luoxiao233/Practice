package com.java.list;

import java.util.LinkedList;

public class Demo3_LinkedList {
/*
 * LinkedList
 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst("a");
		list.addFirst("b");
		list.addFirst("c");
		list.addFirst("d");
		System.out.println(list); //��ӡ��������[d, c, b, a]
		
		list.removeLast();    //ɾ�����һ��
		System.out.println(list);  //��ӡ����[d, c, b]
	}

}
