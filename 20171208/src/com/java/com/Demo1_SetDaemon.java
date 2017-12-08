package com.java.com;

public class Demo1_SetDaemon {
	/*
	 *  setDaemon(), 设置一个线程为守护线程, 该线程不会单独执行, 当其他非守护线程都执行结束后, 自动退出
	 *  通俗的理解：守护线程是非守护线程的保姆，只有当非守护线程工作完成后，告诉守护线程（这里需要时间），守护线程才停止。
	 *  
	 */
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run(){
				for (int i = 0; i < 2; i++) {
					System.out.println(getName() + "aaaaaaaaaa");
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				for (int i = 0; i < 50; i++) {
					System.out.println(getName() + "..bb");
				}
			}
		};
		t2.setDaemon(true);  //设置线程2为守护线程
		t1.start();
		t2.start();
	}

}
