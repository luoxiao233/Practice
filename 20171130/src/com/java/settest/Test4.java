package com.java.settest;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import com.java.bean.Student;

public class Test4 {
	/*
	 * * A:������ʾ
	 	* ���󣺼���¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ������������̨��
	 	* 1.����¼��Scanner����
	 	* 2.����TreeSet����,����Ƚ���(�����ִܷӸߵ������������̨)
	 	* 3.����¼��5��ѧ����Ϣ������Ϊ�ж����� : while(ts.size < 5)
	 	* 4.���ַ������ռ���¼���ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),��������ʽ�����и�,�����ַ�������
	 	* 5.���ַ��������е��и�õ��ַ���ת����int��,����Щ��Ϣ��װ��ѧ�������,��ѧ����������TreeSet������
	 	* 6.�������ÿһ��ѧ�����󼴿�
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����");
		
		
		TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int num = o2.getSum() - o1.getSum();
				return num == 0 ? 1:num;
			}
		});
		while (ts.size() < 5) {
			String s= sc.nextLine();
			String[] arr = s.split(",");
			int[] arr1 = new int[3];
			try {
				for (int i = 1; i < arr.length; i++) {
					arr1[i-1] = Integer.parseInt(arr[i]);
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("��Ĳ���");
			}
			ts.add(new Student(arr[0], arr1[0], arr1[1], arr1[2]));
		}
		for (Student st : ts) {
			System.out.println(st);
		}
		
	}

}
