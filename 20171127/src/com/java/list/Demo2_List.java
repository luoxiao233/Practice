package com.java.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo2_List {
/*
 * ��Ԫ�غϼ��в��ҳ�world�����������������javaee
 */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("world");
		list.add("d");
		list.add("e");
		list.add("f");       //��ϼ��������Ԫ�أ�Ԫ�������������˳������
		ListIterator lit = list.listIterator();    //��ȡ������������list���е� ////listIterator��Iterator���ӽӿ�
		while (lit.hasNext()) {          //������hasNext()��Iterator�еķ������������жϼ������Ƿ���Ԫ��
			Object obj = lit.next();     //������Ԫ��ż���� ���������յ�
			if ("world".equals(obj)) {
				lit.add("javaee");
			}
		}
		System.out.println(list);
	}

}
