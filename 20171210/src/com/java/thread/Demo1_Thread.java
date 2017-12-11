package com.java.thread;


public class Demo1_Thread {

	public static void main(String[] args) {
		
	}

}
//����ʽ����ģʽ
class Singleton{
	//1.˽�й��췽��
	private Singleton(){}
	//2.�����д���һ���������
	private static Singleton s = new Singleton();
	//3.�ṩ���ʷ�ʽ
	public static Singleton getInstance(){
		return s;
	}
}

//����ʽ����ģʽ
class Singleton1{
	//1.˽�й��죬������������ʱ������
	private Singleton1(){}
	//2.����������һ������
	private static Singleton1 s1;
	//3.�ṩ���ʷ�ʽ
	public static Singleton1 getInstance(){
		if (s1 == null) {
			s1 = new Singleton1();
		}
		return s1;
	}
}

//final ģʽ
class Singleton2{
	private Singleton2(){}
	private static final Singleton2 s2 = new Singleton2();
}




class A{
	private A(){}
	private static A haha = new A();
	public static A getf(){
		return haha;
	}
}

class B{
	private B(){}
	private static B hehe;
	public static B getF(){
		if (hehe == null) {
			B hehe = new B();
		}
		return hehe;
	}
}

class C{
	private C(){}
	private static final C xixi = new C();
	
}