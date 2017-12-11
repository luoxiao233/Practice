package com.java.thread2;

public class Demo2_Notify {

	public static void main(String[] args) {
		printer2 p2 = new printer2();
		new Thread(){
			public void run(){
				while(true){
					try {
						p2.print1();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		new Thread(){
			public void run(){
				while(true){
					try {
						p2.print2();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		new Thread(){
			public void run(){
				while(true){
					try {
						p2.print3();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
	}

}
class printer2 extends Thread{
	private int flag = 1;
	public void print1() throws Exception{
		synchronized (this) {
			while (flag != 1) {
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
//			this.notify();
			this.notifyAll();
		}
	}
	public void print2() throws Exception{
		synchronized (this) {
			while (flag != 2) {
				this.wait();
			}
			System.out.print("人");
			System.out.print("不");
			System.out.print("好");
			System.out.print("\r\n");
			flag = 3;
//			this.notify();
			this.notifyAll();    //唤醒全部在等待的
		}
	}
	public void print3() throws Exception{
		synchronized (this) {
			while (flag != 3) {
				this.wait();
			}
			System.out.print("B");
			System.out.print("A");
			System.out.print("T");
			System.out.print("\r\n");
			flag = 1;
//			this.notify();
			this.notifyAll();
		}
	}
}