package com.java.string;

public class Demo1_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";    //字符串也可以直接当作一个对象来使用
		s1 = "edf";      //本来字符串一经赋值后是不能经过改变的，但是这里只是通过了用s1覆盖以前的地址导致abc为垃圾
		System.out.println(s1);   // 输出efg
	}

}
