package com.java.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo3_ListIterator {
	/*
	 * * boolean hasNext()�Ƿ�����һ��
			* boolean hasPrevious()�Ƿ���ǰһ��
			* Object previous();������һ��Ԫ��
			* cursor : ָ��,���
	 */
	public static void main(String[] args) {
		List list = new ArrayList();   //����ָ��������� 
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");    //����������Ӷ���
		ListIterator lit = list.listIterator();  //ʹ�õ�����  ListIterator��Iterator�Ľӿ�
		while(lit.hasNext()){     //�ж��Ƿ������һ��Ԫ��
			System.out.println(lit.next());
		}
		while(lit.hasPrevious()){
			System.out.println(lit.previous());
		}
	}

}
