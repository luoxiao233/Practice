package com.java.thread;

public class Demo1_Thread {
	/*
	 * JVM的启动是多线程的吗
	 * JVM启动至少启动了垃圾回收线程和主线程，所以是多线程的。
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 1000000; i++) {   //垃圾回收线程
			new Demo();
		}
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("aaaaaaaaa");
		}
	}

}
class Demo{

	@Override
	protected void finalize() {
		System.out.println("垃圾清理");
	}
	
}