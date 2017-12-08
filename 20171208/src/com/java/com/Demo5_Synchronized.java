package com.java.com;

public class Demo5_Synchronized {
	/*
	 使用synchronized关键字修饰一个方法, 该方法中所有的代码都是同步的
	 非静态同步函数的锁是:this
	静态的同步方法的锁对象是该类的字节码对象  .class
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
		synchronized(d){            //锁对象不能为匿名对象，必须是同一个任意对象
			System.out.print("我");
			System.out.print("爱");
			System.out.print("程");
			System.out.print("序");
			System.out.print("员");
			System.out.print("我");
			System.out.print("\r\n");
		}
	}
	public void print2(){
		synchronized(d){
			System.out.print("人");
			System.out.print("不");
			System.out.print("好");
			System.out.print("\r\n");
		}
	}
}

class Demo{}

