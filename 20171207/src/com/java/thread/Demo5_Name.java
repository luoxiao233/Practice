package com.java.thread;

public class Demo5_Name {
	/*
	 * * 1.��ȡ����
			* ͨ��getName()������ȡ�̶߳��������
		* 2.��������
			* ͨ�����캯�����Դ���String���͵�����
			* setName(String name)
		* Thread-0 .... (�������û�и���/�����̵߳�����,ϵͳ��Ĭ�ϸ���)
		* 
		* Thread.currentThread(), ���߳�Ҳ���Ի�ȡ
	 */
	public static void main(String[] args) {
//		demo1();
//		demo2();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + ",,,,,");
				}
			}
		}).start();
	}

	public static void demo2() {
		Thread t1 = new Thread(){
			public void run(){
				for (int i = 0; i < 111; i++) {
					System.out.println(this.getName() + "iiii");
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				for (int i = 0; i < 222; i++) {
					System.out.println(this.getName() + "00000000");
				}
			}
		};
		t1.setName("gjwe");
		t2.setName("999");
		t1.start();
		t2.start();
	}

	public static void demo1() {
		new Thread(){
			public void run(){
				for (int i = 0; i < 100; i++) {
					System.out.println(this.getName() + "11111111");
					
				}
			}
		}.start();
		new Thread("haha"){
			public void run(){
				for (int i = 0; i < 100; i++) {
				System.out.println(this.getName() + "222222222");
				}
			}
		}.start();
	}

}
