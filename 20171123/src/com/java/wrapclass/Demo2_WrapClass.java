package com.java.wrapclass;

public class Demo2_WrapClass {

	public static void main(String[] args) {
		/*
		 * int ->String ���������֣�
			 * a.ֱ��ʹ��   int + ""   ��ƴ��ת��String
			 * b.public static String valueOf(int i)  :�������Ƽ�ʹ��  String.valueOf(int i)
			 * c.int->Integer->String(Integer���toString����())
			 * d.public static String toString(int i)(Integer��ľ�̬����) Integer.toString(int i)
		 * 
		 * String -- int
			 * 1.String->Integer->int
			 * 2.public static int parseInt(String s)
		 */
		
//		demo1();
		String s = "200";
		Integer in = new Integer(s);     //1    String->Integer
		int i1 = in.intValue();           //1    Integer->String    ��intValue()����
		System.out.println(i1);
		
		int i2 = Integer.parseInt(s);     //  2    Integer.parseInt(s)
		System.out.println(i2);
		
	}

	static void demo1() {
		int i = 100;
		String s1 = i + "";          //a
		System.out.println(s1);
		
		String s2 = String.valueOf(i);  //b
		System.out.println(s2);
		
		Integer in = new Integer(i);   // c   int->Integer
		String s3 = in.toString();     // c   Integer->String
		System.out.println(s3);
		
		String s4 = Integer.toString(i);  //d
		System.out.println(s4);
	}

}
