package com.java.thread;

public class Demo3_Thread {
/*
 * ���߳�ʵ�ֵķ���2
 * ͨ��ʵ��Runnable�ӿں���дrun����
 */
	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
		t.start();
		
		for (int i = 0; i < 444; i++) {
			System.out.println("bb");
		}
	}

}
class MyRunnable implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 555; i++) {
			System.out.println("aaaaaaa");
		}
	}
	
}
