package com.java.otherclass;

public class Demo3_System {

	public static void main(String[] args) {
		/*
		 * System 类，不能被实例化。
		 * public static void gc()         //收集垃圾
		 * public static void exit(int status)     //退出
		 * public static long currentTimeMillis()   //当前时间    注意：返回的是long型
		 */
		
//		demo1();
//		demo2();
		long start = System.currentTimeMillis();   //现在的时间
		for (int i = 0; i < 100; i++) {
			System.out.println("*");
		}
		long end = System.currentTimeMillis();    //运行完 上个程序后的 现在的时间
		System.out.println(start);
		System.out.println(end);
		System.out.println(end-start);        	//两个时间差值
		
		
	}

	static void demo2() {
		System.out.println("1111111111");
		System.exit(22);                  //直接退出，控制台不会输出任何
		System.out.println("1111111111");
	}

	static void demo1() {
		for (int i = 0; i < 100; i++) {
			new Demo();
			System.gc();     //就是用来收集垃圾的
		}
	}
}
class Demo{

	@Override
	protected void finalize() throws Throwable {
		System.out.println("收集垃圾");
	}
	
}
