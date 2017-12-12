package com.java.meiju;

public class Meiju {
/*
 * 实现枚举的三种方式（用单例模式实现）
 */
	public static void main(String[] args) {

	}

}

class Week1{
	public static final Week1 mon = new Week1();
	public static final Week1 tue = new Week1();
	public static final Week1 wed = new Week1();
	private Week1(){}
}

class Week2{
	public static final Week2 mon = new Week2("星期一");
	public static final Week2 tue = new Week2("星期二");
	public static final Week2 wed = new Week2("星期三");
	private Week2(String name){
		this.name = name;
	}
	private String name;
}

abstract class Week3{
	public static final Week3 mon = new Week3("星期一"){

		@Override
		public void show() {
			System.out.println("星期一");
		}
	};
	public static final Week3 tue = new Week3("星期二"){

		@Override
		public void show() {
			System.out.println("星期二");
		}
	};
	public static final Week3 wed = new Week3("星期三"){

		@Override
		public void show() {
			System.out.println("星期三");
		}
	};
	private String name;
	public abstract void show();
	private Week3(String name){
		this.name = name;
	}
}
