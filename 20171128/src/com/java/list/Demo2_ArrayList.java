package com.java.list;

import java.util.ArrayList;
import java.util.Iterator;

import com.java.bean.Student;

public class Demo2_ArrayList {
/*
 * ɾ���������ظ���Ԫ��
 */
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("����",23));
		list.add(new Student("����",23));
		list.add(new Student("��4",24));
		list.add(new Student("��4",24));
		list.add(new Student("��4",24));
		ArrayList newList = getSingle(list);
		System.out.println(newList);   
		//���λ�����Student��û����дtoString ��ôֻ���ӡ����ֵַ
		//���λ�����Student��û����дequals��������ô �ظ���Ҳ�ᱻ��ӡ����
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
