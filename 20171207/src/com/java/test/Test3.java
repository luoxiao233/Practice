package com.java.test;

import java.util.ArrayList;

public class Test3 {
	/*
	 * Լɪ�� :��������
	 * ���ͣ�һȺ��վ��һ��Ȧ����1��ʼ����������3���޳���ֱ�����ֻʣһ������ƣ�Լɪ�򻷣�
	 */
	public static void main(String[] args) {
		System.out.println(getLucky(7));
	}

	public static int getLucky(int num){
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= num; i++) {
			list.add(i);                     //��ÿ�������뵽һ�������򼯺��У����Ǳ���ģ�
		}
		int count = 1;         				//��1��ʼ����
		for (int i = 0; list.size() != 1; i++) {      //���ʣһ���˵�ʱ���ֹͣ��ֻҪһ���ˣ�
			if (i == list.size()) {             //���������������ֵʱ����i��Ϊ0�� ��������
				i = 0 ;
			}
			if (count % 3 == 0) {         //���������3�ı����� �޳�
				list.remove(i--);         //remove�޳���������ǰ���ǣ�--�Ǳ����
			}
			count++;	 				//�ۼӵļ�ʱ��
		}
		return list.get(0);
	}
}
