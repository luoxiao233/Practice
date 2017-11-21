package com.java.method.b;

import static com.java.method.a.Operate.*;     //静态导入包中的Operate类的*(全部方法)

public class StaticImportDemo {

	public static void main(String[] args) {
		System.out.println("4 + 4 =" + add(4,4));      //直接调用静态方法
		System.out.println("4 - 4 =" + sub(4,4));      //直接调用静态方法
		System.out.println("4 * 4 =" + mul(4,4));      //直接调用静态方法
		System.out.println("4 / 4 =" + div(4,4));      //直接调用静态方法
	}
}
