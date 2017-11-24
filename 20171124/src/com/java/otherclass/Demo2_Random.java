package com.java.otherclass;

import java.util.Random;

public class Demo2_Random {

	public static void main(String[] args) {
//		demo1();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println(r.nextInt(100));   //取    0<=随机数<100   的10个
		}
	}

	static void demo1() {
		Random r = new Random();
		System.out.println(r);       //java.util.Random@6d06d69c
		
		int x = r.nextInt();
		System.out.println(x);      //产生一个随机数  每次都不一样的
		
		Random r1 = new Random(1000);
		int x1 = r1.nextInt();  
		System.out.println(x1);     //这两种情况下的随机数不会变的, 因为new Random(1000)限定了范围
	}

}
