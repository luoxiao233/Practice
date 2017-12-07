package com.java.thread;

public class Demo2_Thread {
/*
 * 多线程是实现方法1
 * 通过继承Thread方法后重写run方法
 * 		开启线程使用start
 */
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();                      //开启线程
		
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
