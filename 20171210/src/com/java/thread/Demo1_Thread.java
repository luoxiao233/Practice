package com.java.thread;


public class Demo1_Thread {

	public static void main(String[] args) {
		
	}

}
//饿汉式单例模式
class Singleton{
	//1.私有构造方法
	private Singleton(){}
	//2.本类中创建一个本类对象
	private static Singleton s = new Singleton();
	//3.提供访问方式
	public static Singleton getInstance(){
		return s;
	}
}

//懒汉式单例模式
class Singleton1{
	//1.私有构造，不让其他类访问本类对象
	private Singleton1(){}
	//2.本类中声明一个引用
	private static Singleton1 s1;
	//3.提供访问方式
	public static Singleton1 getInstance(){
		if (s1 == null) {
			s1 = new Singleton1();
		}
		return s1;
	}
}

//final 模式
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