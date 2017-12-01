package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Test4 {

	public static void main(String[] args) {
		String[] color= {"����","÷��","����","����"};
		String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		ArrayList<Integer> list = new ArrayList<>();
		int index = 0;
		HashMap<Integer, String> hm = new HashMap<>();
		
		for (String s1 : num) {
			for (String s2 : color) {
				hm.put(index, s2.concat(s1));        //���հ�˫�м����� �������
				list.add(index);                     //Ŀ���ǰ�list�������Ϊ Ԫ�أ�Ϊ0-53����Ȼ��
				index ++;
			}
		}
		System.out.println(index);     //������
		hm.put(index, "С��");
		System.out.println(hm.get(52));  //������
		list.add(index);
		index ++;
		hm.put(index, "����");
		list.add(index);               //�պ����  53 ���Ԫ��
//		System.out.println(list);
		
		Collections.shuffle(list);        //������54 ��Ԫ��
		
		TreeSet<Integer> n1 = new TreeSet<>();      //��һ���˵��� TreeSet��Ϊ�˻��˳��
		TreeSet<Integer> n2 = new TreeSet<>();
		TreeSet<Integer> n3 = new TreeSet<>();
		TreeSet<Integer> di = new TreeSet<>();
		
		for (int i = 0; i <list.size(); i++) {
			if (i >= list.size() - 3) {
				di.add(list.get(i));
			}else if (i % 3 == 0) {
				n1.add(list.get(i));
			}else if (i % 3 == 1) {
				n2.add(list.get(i));
			}else {
				n3.add(list.get(i));
			}
		}
		
		
		lookPoker("n1",n1,hm);
		lookPoker("n2",n2,hm);
		lookPoker("n3",n3,hm);
		lookPoker("di",di,hm);
	}

	public static void lookPoker(String name,TreeSet<Integer> ts,HashMap<Integer, String> hm) {
		System.out.print(name + "����:");
		for(Integer i : ts) {
			System.out.print(hm.get(i) + " ");
		}
		System.out.println();
	}

}
