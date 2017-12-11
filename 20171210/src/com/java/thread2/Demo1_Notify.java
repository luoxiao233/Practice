package com.java.thread2;

public class Demo1_Notify {
/*
 * 线程间的通信
 */
	public static void main(String[] args) {
		print p = new print();
		Thread t1 = new Thread(){
			public void run(){
				while(true){
					try {
						p.print1();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				while(true){
					try {
						p.print2();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		t1.start();
		t2.start();
	}

}
class print extends Thread{
	private int flag = 1;
	public void print1() throws Exception{
		synchronized (this) {
			if (flag != 1) {
				this.wait();
			}
			System.out.print("我");
			System.out.print("爱");
			System.out.print("程");
			System.out.print("序");
			System.out.print("员");
			System.out.print("我");
			System.out.print("\r\n");
			flag = 2;
			this.notify();
		}
	}
	public void print2() throws Exception{
		synchronized (this) {
			if (flag != 2) {
				this.wait();
			}
			System.out.print("人");
			System.out.print("不");
			System.out.print("好");
			System.out.print("\r\n");
			flag = 1;
			this.notify();
		}
	}
}

