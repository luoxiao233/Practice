package com.java.thread;

public class Demo6_Thread {
	/*
	 * Thread.sleep(毫秒,纳秒), 控制当前线程休眠若干毫秒
	 * 1秒= 1000毫秒  1秒 = 1000 * 1000 * 1000纳秒 1000000000
	 * 
	 * sleep休眠          wait等待（需要别人唤醒）
	 */
	public static void main(String[] args) {
		new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					System.out.println("`````````");
					try {      					//父类没有异常的话就要自己处理
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					System.out.println("1111111");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
	}

}
