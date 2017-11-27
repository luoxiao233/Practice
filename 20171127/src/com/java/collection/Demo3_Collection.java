package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.java.bean.Student;

public class Demo3_Collection {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
//		demo1();
		Collection c = new ArrayList(); 
		c.add(new Student("����",23));  //Object obj = new Student("����"��23);  ����ת��
		c.add(new Student("����",24));
		c.add(new Student("����",25));
		c.add(new Student("����",26));
		
		Object[] arr = c.toArray();   //������תΪ����
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); //ֻ��������ʾ���
			Student s = (Student)arr[i];    //����ת��
			System.out.println(s.getName() + s.getNum());//����ת��֮�����е�getName()��getNum()���Ե���������ʹ��
		}
	}

	static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("c");
	}

}
