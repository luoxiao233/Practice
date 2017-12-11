package com.java.thread2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Demo3_ReentrantLock {

	public static void main(String[] args) {
		printer3 p3 = new printer3();
		new Thread(){
			public void run(){
				while(true){
					try {
						p3.print1();
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
						p3.print2();
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
						p3.print3();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
	}

}
class printer3 extends Thread{
	ReentrantLock r = new ReentrantLock();     //创建互斥锁对象
	Condition c1 = r.newCondition();
	Condition c2 = r.newCondition();
	Condition c3 = r.newCondition();
	private int flag = 1;
	public void print1() throws Exception{
		r.lock();
		if (flag != 1) {
//			this.wait();
			c1.await();
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
//		this.notifyAll();
		c2.signal();
		
	}
	public void print2() throws Exception{
		r.lock();
		if (flag != 2) {
//			this.wait();
			c2.await();
		}
		System.out.print("人");
		System.out.print("不");
		System.out.print("好");
		System.out.print("\r\n");
		flag = 3;
//			this.notify();
//		this.notifyAll();    //唤醒全部在等待的
		c3.signal();
	}
	public void print3() throws Exception{
		r.lock();
		if (flag != 3) {
//			this.wait();
			c3.await();
		}
		System.out.print("B");
		System.out.print("A");
		System.out.print("T");
		System.out.print("\r\n");
		flag = 1;
//			this.notify();
//		this.notifyAll();
		c1.signal();
	}
}