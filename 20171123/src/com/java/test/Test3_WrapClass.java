package com.java.test;

public class Test3_WrapClass {

	public static void main(String[] args) {
		Integer i1 = new Integer(97);
		Integer i2 = new Integer(97);
		System.out.println(i1 == i2);            // 创建出来的两个对象地址值不一样
		System.out.println(i1.equals(i2));		//true
		System.out.println("-----------");
	
		Integer i3 = new Integer(197);
		Integer i4 = new Integer(197);
		System.out.println(i3 == i4);         //同上
		System.out.println(i3.equals(i4));    //true
		System.out.println("-----------");
	
		Integer i5 = 97;		//自动装箱      97是int型，直接变成了Integer   1.5版本新特性
		Integer i6 = 97;        // 相当于一个常量
		System.out.println(i5 == i6);
		System.out.println(i5.equals(i6));		//true
		System.out.println("-----------");
	
		Integer i7 = 197;		//new Inter(197)  超过-128到127是byte的取值范围 就会创建
		Integer i8 = 197;		//new Inter(197)
		System.out.println(i7 == i8);
		System.out.println(i7.equals(i8));
		
		/*
		 * -128到127是byte的取值范围,如果在这个取值范围内,自动装箱就不会新创建对象,而是从常量池中获取
		 * 如果超过了byte取值范围就会再新创建对象
		 * 
		 * public static Integer valueOf(int i) {
		        if (i >= IntegerCache.low && i <= IntegerCache.high)			//i>= -128 && i <= 127
		            return IntegerCache.cache[i + (-IntegerCache.low)];
					else 
		        return new Integer(i);
		    }
		 */
	}

}
