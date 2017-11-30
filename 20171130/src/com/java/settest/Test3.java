package com.java.settest;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test3 {
	/*
	 * ����������, ���ԴӼ���������ն������, ֱ������quitʱ��������. ����������������������д�ӡ.
	 * ����:
	 * 1.����¼�� Scanner����
	 * 2.����TreeSet����,����Ƚ���
	 * 3.ʹ������ѭ��,�������ַ���quit����ֹѭ��;
	 * 4.����������ַ���,����ת����int���洢��TreeSet������
	 * 5.����TreeSet����,��ӡ���ÿһ��Ԫ��
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����");
		
		
		
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				int num = o2 - o1;
				return num == 0 ? 1:num;
			}
		});
		while (true) {
			String line = sc.nextLine();
			if ("quit".equals(line)) {
				break;
			}else {
				try {
					int i = Integer.parseInt(line);
					ts.add(i);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					System.out.println("���벻��");
				}
			}
		}
		System.out.println(ts);
	}

}
