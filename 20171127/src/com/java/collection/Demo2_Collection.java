package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({ "rawtypes", "unchecked" })  // �����ÿ�ݼ�Ctrl+1����ӵ�
public class Demo2_Collection {
	/*
	 * * A:������ʾ	
			����������ʾ
			boolean add(E e)			���		:add�����ײ㷵�ص���true:���ʵ�ֵ���List������,��û�б�Ҫд����ֵ������,��Ϊ����true
			boolean remove(Object o)	ɾ��
			void clear()				���
			boolean contains(Object o)  �Ƿ����
			boolean isEmpty()			�Ƿ�Ϊ��
			int size()					���ϳ���
		B: ע��(���˽�:ɨ��) ctrl + 1
	 */
	public static void main(String[] args) {
//		demo1();
		Collection c = new ArrayList();
		c.add("a");      
		c.add("b");
		c.add("b");
		c.add("d");      //��˳�����������
		
//		System.out.println(c);
//		boolean b = c.remove("b");   //ɾ��b
//		System.out.println(b);    //ȷ���Ѿ�ɾ�� 
//		System.out.println(c);   //�ٴβ鿴
		
		boolean b2 = c.contains("c");
		System.out.println(b2); //�ж��Ƿ����
		
		
	}

	static void demo1() {
		//Collection c = new Collection();    ������������
		Collection c = new ArrayList();    //���������������
		boolean b1 = c.add("abc");   //��������ǲ����͡� ��list���ֿ���ǰ����Բ�дboolean
		System.out.println(b1);
		System.out.println(c);
		boolean b2 = c.add(true);
		System.out.println(b2);
		System.out.println(c);
	}

}
