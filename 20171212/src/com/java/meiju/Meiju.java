package com.java.meiju;

public class Meiju {
/*
 * ʵ��ö�ٵ����ַ�ʽ���õ���ģʽʵ�֣�
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
	public static final Week2 mon = new Week2("����һ");
	public static final Week2 tue = new Week2("���ڶ�");
	public static final Week2 wed = new Week2("������");
	private Week2(String name){
		this.name = name;
	}
	private String name;
}

abstract class Week3{
	public static final Week3 mon = new Week3("����һ"){

		@Override
		public void show() {
			System.out.println("����һ");
		}
	};
	public static final Week3 tue = new Week3("���ڶ�"){

		@Override
		public void show() {
			System.out.println("���ڶ�");
		}
	};
	public static final Week3 wed = new Week3("������"){

		@Override
		public void show() {
			System.out.println("������");
		}
	};
	private String name;
	public abstract void show();
	private Week3(String name){
		this.name = name;
	}
}
