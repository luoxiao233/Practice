package com.java.thread;

public class Demo3_Thread {
/*
 * 多线程实现的方法2
 * 通过实现Runnable接口后重写run方法
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
