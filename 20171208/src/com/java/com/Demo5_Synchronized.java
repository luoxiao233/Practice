package com.java.com;

public class Demo5_Synchronized {
	/*
	 ʹ��synchronized�ؼ�������һ������, �÷��������еĴ��붼��ͬ����
	 �Ǿ�̬ͬ������������:this
	��̬��ͬ���������������Ǹ�����ֽ������  .class
	 */
	public static void main(String[] args) {
		Printer p = new Printer();
		new Thread(){
			public void run(){
				while(true){
					p.print1();
				}
			}
		}.start();
		
		new Thread(){
			public void run(){
				while(true){
					p.print2();
				}
			}
		}.start();
	}
}

class Printer extends Thread{
	Demo d = new Demo();
	public void print1(){
		synchronized(d){            //��������Ϊ�������󣬱�����ͬһ���������
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ա");
			System.out.print("��");
			System.out.print("\r\n");
		}
	}
	public void print2(){
		synchronized(d){
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("\r\n");
		}
	}
}

class Demo{}

