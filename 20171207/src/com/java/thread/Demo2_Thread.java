package com.java.thread;

public class Demo2_Thread {
/*
 * ���߳���ʵ�ַ���1
 * ͨ���̳�Thread��������дrun����
 * 		�����߳�ʹ��start
 */
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();                      //�����߳�
		
		for (int i = 0; i < 111; i++) {
			System.out.println("bb");
		}
	}

}
class MyThread extends Thread{
	public void run(){
		for (int i = 0; i < 111; i++) {
			System.out.println("aaaaaaaaa");
		}
	}
}
