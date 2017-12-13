package com.java.nums;

public class Demo2_Enum {

	public static void main(String[] args) {
//		demo1();
//		demo2();
		Week2[]arr = Week2.values();
		for (Week2 week2 : arr) {
			System.out.println(week2);
		}
		
	}

	public static void demo2() {
		Week2 mo = Week2.MON;
		System.out.println(mo.toString());
		System.out.println(mo);
		System.out.println(mo.getName());
	}

	public static void demo1() {
		Week2 mo = Week2.MON;
		Week2 tu = Week2.TUE;
		Week2 we = Week2.WED;
		System.out.println(mo.ordinal());   //获取序数
		System.out.println(mo.compareTo(tu));   //比较的是序数大小
		System.out.println(we.name());
	}

}
