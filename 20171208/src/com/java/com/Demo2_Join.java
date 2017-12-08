package com.java.com;

public class Demo2_Join {
/*
 * 	join(), 当前线程暂停, 等待指定的线程执行结束后, 当前线程再继续
 * 	join(int), 可以等待指定的毫秒之后继续
 * 
 */
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run(){
				for (int i = 0; i < 100; i++) {
					System.out.println(this.getName() + "········这是线程1");
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					try {
						t1.join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(this.getName() + "线程2");
				}
			}
		};
		t1.start();
		t2.start();
	}

}
