package com.java.buffer;

public class Demo1_Constructor {

	public static void main(String[] args) {
		/*
		 * StringBuffer简单的说就是一个线程安全的可变字符序列（类似于String的一个缓冲区，但是不能用+来拼接）
		 */
		
		
//		Demo1();
		StringBuffer b = new StringBuffer();
		b.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println(b.capacity());  //如果长度为0-16之间，那么容量为16，如果是16-34，容量为34，如果>34,那么长度为多少长度就是多少
		System.out.println(b.length()); //长度为33  因为有33个a
	}

	static void Demo1() {
		StringBuffer b = new StringBuffer();   
		System.out.println(b.capacity());//默认的字符缓冲区容量为16（指0-15）
		System.out.println(b.length());   //字符缓冲区现有的长度为0（因为是无参构造方法）
		b.append("aaaaaaaaaaaaaaaa");      //往字符缓冲区添加16个字符
		System.out.println(b.capacity());  //容量还是16  --因为添加16个字符没有超过16
		System.out.println(b.length());  //16   长度即变为了16
		b.append("aaaaaaaaaaaaaaaaa");   //再往 字符缓冲区 添加17个字符
		System.out.println(b.capacity()); //容量变为了34
		System.out.println(b.length());  //长度为34   16+17
	}
}
