package com.java.list;

import java.util.LinkedList;

public class Demo4_LinkedList {
	/*
	 * * A:������ʾ
			* ��������LinkedListģ��ջ���ݽṹ�ļ��ϣ������� : �Ƚ����
			* ����һ���ཫLinkedList�еķ�����װ : Stack
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Stack s = new Stack();
		s.in("a");
		s.in("b");
		s.in("c");
		s.in("d");
		while(!s.isEmpty()) {
			System.out.println(s.out());
		}
	}

}
