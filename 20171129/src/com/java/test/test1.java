package com.java.test;

import java.util.HashSet;
import java.util.Random;

public class test1 {
	/*
	 * * A:������ʾ
	 	* ���󣺱�дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ����������յ���������������̨��
	 	* 
	 	* ����:
	 	* 1.��ȡ�����,��Random��
	 	* 2.Ҫ������������ظ�,����һ��Set����
	 	* 3.������洢��������,set�����е�size���С��10,һֱ�洢,���������ѭ��
	 	* 4.�������ϲ���������
	 */
	public static void main(String[] args) {
//		1.����һ�������ظ���set����
		HashSet<Integer> hs = new HashSet<>();   
//		2.��Ҫ���������
		Random r = new Random();
//		3.ѭ��һֱ�棬ֱ������10��
		while(hs.size() < 10){
			hs.add(r.nextInt(20)+1);  //���е�int��ֱ�ӻ��Ϊinteger��  �Զ�װ��
		}
		for (Integer integer : hs) {
			System.out.println(integer);
		}
	}

}
