package com.java.object;

import com.java.bean.Student;

public class Demo1_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = new Object();
		System.out.println(o.hashCode());   // 返回的是对象的哈希码值，这个值是用过对象的地址来计算的，所以一般如果是同一个对象的话，那么哈希码值是一样的。
		
		Student s =  new Student();
		System.out.println(s.hashCode());
	}

}
