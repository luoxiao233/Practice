package com.java.test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test1 {
/*
 * 通过反射越过泛型检查：泛型擦除/泛型反射
 * 原因：因为泛型只在编译器有效（只是用来检查语法错误的）
 */
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(111);
		list.add(222);
		
		//获取字节码对象
		Class clazz = Class.forName("java.util.ArrayList");
		Method m = clazz.getDeclaredMethod("add", Object.class);
		m.setAccessible(true);
		m.invoke(list, "abc");
		System.out.println(list);
	}

}
