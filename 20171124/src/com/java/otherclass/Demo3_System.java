package com.java.otherclass;

public class Demo3_System {

	public static void main(String[] args) {
		/*
		 * System �࣬���ܱ�ʵ������
		 * public static void gc()         //�ռ�����
		 * public static void exit(int status)     //�˳�
		 * public static long currentTimeMillis()   //��ǰʱ��    ע�⣺���ص���long��
		 */
		
//		demo1();
//		demo2();
		long start = System.currentTimeMillis();   //���ڵ�ʱ��
		for (int i = 0; i < 100; i++) {
			System.out.println("*");
		}
		long end = System.currentTimeMillis();    //������ �ϸ������� ���ڵ�ʱ��
		System.out.println(start);
		System.out.println(end);
		System.out.println(end-start);        	//����ʱ���ֵ
		
		
	}

	static void demo2() {
		System.out.println("1111111111");
		System.exit(22);                  //ֱ���˳�������̨��������κ�
		System.out.println("1111111111");
	}

	static void demo1() {
		for (int i = 0; i < 100; i++) {
			new Demo();
			System.gc();     //���������ռ�������
		}
	}
}
class Demo{

	@Override
	protected void finalize() throws Throwable {
		System.out.println("�ռ�����");
	}
	
}
