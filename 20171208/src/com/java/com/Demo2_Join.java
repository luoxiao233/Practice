package com.java.com;

public class Demo2_Join {
/*
 * 	join(), ��ǰ�߳���ͣ, �ȴ�ָ�����߳�ִ�н�����, ��ǰ�߳��ټ���
 * 	join(int), ���Եȴ�ָ���ĺ���֮�����
 * 
 */
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run(){
				for (int i = 0; i < 100; i++) {
					System.out.println(this.getName() + "���������������������߳�1");
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
					System.out.println(this.getName() + "�߳�2");
				}
			}
		};
		t1.start();
		t2.start();
	}

}
