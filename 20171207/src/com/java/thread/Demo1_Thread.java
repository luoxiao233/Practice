package com.java.thread;

public class Demo1_Thread {
	/*
	 * JVM�������Ƕ��̵߳���
	 * JVM�����������������������̺߳����̣߳������Ƕ��̵߳ġ�
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 1000000; i++) {   //���������߳�
			new Demo();
		}
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("aaaaaaaaa");
		}
	}

}
class Demo{

	@Override
	protected void finalize() {
		System.out.println("��������");
	}
	
}