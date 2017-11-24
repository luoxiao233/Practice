package com.java.otherclass;

public class Demo1_Math {

	public static void main(String[] args) {
		double d = 2.3;
		double d1 = 3.4;
		System.out.println(Math.abs(d));        //取得绝对值
		System.out.println(Math.ceil(d));       //向上取整
		System.out.println(Math.floor(d));      //向下取整
		System.out.println(Math.round(d));      //默认返回的是Int
		
		System.out.println(Math.max(d, d1));    //取出两个数中的最大值   同理可得最小值
		
		System.out.println(Math.random());      //获得随机数        0<=随机数<1
		
		System.out.println(Math.pow(2,3));       //2为底数，3为指数     这两个数默认为double  所以返回值也是double
		
		System.out.println(Math.sqrt(2.0));      //  返回这个数的开根号    1.414...
		
		System.out.println(Math.round(3.3333));   // Math.round() 用于   double的四舍五入
	}
}
