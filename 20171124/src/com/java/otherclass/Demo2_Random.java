package com.java.otherclass;

import java.util.Random;

public class Demo2_Random {

	public static void main(String[] args) {
//		demo1();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println(r.nextInt(100));   //ȡ    0<=�����<100   ��10��
		}
	}

	static void demo1() {
		Random r = new Random();
		System.out.println(r);       //java.util.Random@6d06d69c
		
		int x = r.nextInt();
		System.out.println(x);      //����һ�������  ÿ�ζ���һ����
		
		Random r1 = new Random(1000);
		int x1 = r1.nextInt();  
		System.out.println(x1);     //����������µ������������, ��Ϊnew Random(1000)�޶��˷�Χ
	}

}
