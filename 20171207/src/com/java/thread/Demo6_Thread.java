package com.java.thread;

public class Demo6_Thread {
	/*
	 * Thread.sleep(����,����), ���Ƶ�ǰ�߳��������ɺ���
	 * 1��= 1000����  1�� = 1000 * 1000 * 1000���� 1000000000
	 * 
	 * sleep����          wait�ȴ�����Ҫ���˻��ѣ�
	 */
	public static void main(String[] args) {
		new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					System.out.println("`````````");
					try {      					//����û���쳣�Ļ���Ҫ�Լ�����
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					System.out.println("1111111");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
	}

}
