package com.java.jdk5;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2_Foreach {
/*
 * (���ֵ������Ƿ��ܹ�ɾ��)
 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		
//		demo1(list);
//		demo2(list);
		
//		demo3(list);
		demo4(list);
		
		System.out.println(list);
	}

public static void demo4(ArrayList<String> list) {
	for (String string : list) {
		if ("b".equals(string)) {
			list.remove("b");    //ͬ���� �����޸��쳣����Ϊ�ײ��ǵ�����ԭ��
		}
	}
}

public static void demo3(ArrayList<String> list) {
	//		ʹ�õ�����������ɾ��
			Iterator<String> it = list.iterator(); //��ȡ������
			while(it.hasNext()){
				String s = it.next();
				if ("b".equals(s)) {
					list.remove("b");   //�����Ტ���޸��쳣
					it.remove();
				}
			}
}

public static void demo2(ArrayList<String> list) {
	for (int i = 0; i < list.size(); i++) {
		if ("b".contains("b")) {
			list.remove("b");
		}
	}
}

public static void demo1(ArrayList<String> list) {
	//ʹ����ͨforѭ����ɾ��,����Ҫ--
	for (int i = 0; i < list.size(); i++) {
		if ("b".equals(list.get(i))) {
			list.remove("b");
			i--;
		}
	}
}
}
