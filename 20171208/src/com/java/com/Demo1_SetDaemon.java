package com.java.com;

public class Demo1_SetDaemon {
	/*
	 *  setDaemon(), ����һ���߳�Ϊ�ػ��߳�, ���̲߳��ᵥ��ִ��, ���������ػ��̶߳�ִ�н�����, �Զ��˳�
	 *  ͨ�׵���⣺�ػ��߳��Ƿ��ػ��̵߳ı�ķ��ֻ�е����ػ��̹߳�����ɺ󣬸����ػ��̣߳�������Ҫʱ�䣩���ػ��̲߳�ֹͣ��
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
		t2.setDaemon(true);  //�����߳�2Ϊ�ػ��߳�
		t1.start();
		t2.start();
	}

}
