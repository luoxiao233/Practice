package com.java.object;

public class Demo2_getName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o1 = new Object();
		Class c = o1.getClass();     //获取到这个字节码的对象
		System.out.println(c.getName());    //通过这个字节嘛对象来找到这个类的名字
	}

}
