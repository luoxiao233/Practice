package com.java.thread;

public class Demo4_Thread {

	public static void main(String[] args) {
		new Thread(){
			public void run(){
				for (int i = 0; i < 222; i++) {
					System.out.println("aaaaaaaa");
				}
			}
		}.start();                //开启线程1
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 111; i++) {
					System.out.println("bb");
				}
			}
		}).start();								//开启线程2
	}	

}
