package com.java.com;

public class Demo4_Priority {
	/*
	 * setPriority()�����̵߳����ȼ�
	 * ��ʵ��������ȼ��ʹ���Ĵ�ӡ��ϵ�������������ȼ��ߵ��߳�ռ�õ�CPU��Դ���ʸ���
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
