package com.java.map;

import java.util.HashMap;

import com.java.bean.Student;

public class Demo1_HashMap {
	/*
	 *  A:������ʾ
	 	* HashMap���ϼ���Studentֵ��String�İ���
	 	* ˫�м��ϴ洢,�����Զ�����ʱ,Ҫ��дhashCode������equals������֤����Ψһ
	 	* 
	 	* �ײ�������ʵ�ֵĿ��Ա�֤��ô�����ôȡ
	 */
	public static void main(String[] args){
		HashMap<Student, String> hm = new HashMap<>();
		hm.put(new Student("��4", 24), "b");
		hm.put(new Student("��5", 25), "be");
		hm.put(new Student("��6", 26), "bei");
		hm.put(new Student("��7", 27), "beij");
		hm.put(new Student("����", 23), "beijing");
		System.out.println(hm);
	}

}
