package com.java.com;

public class Demo4_Priority {
	/*
	 * setPriority()设置线程的优先级
	 * 其实代码的优先级和代码的打印关系不定，但是优先级高的线程占用的CPU资源概率更大。
	 */
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run(){
				for (int i = 0; i < 100; i++) {
					System.out.println(this.getName() + "aaaaa");
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				for (int i = 0; i < 100; i++) {
					System.out.println(this.getName() + "b");
				}
			}
		};
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
	}

}
