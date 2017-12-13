package com.java.nums;

public class Demo1_Enum {

	public static void main(String[] args) {
		Week1 w1 = Week1.MON;
		System.out.println(w1);
		
		Week2 w2 = Week2.TUE;
		System.out.println(w2.getName());
		
		Week3 w3 = Week3.WED;
		w3.show();
	}

}
enum Week1{
	MON,TUE,WED;
}

enum Week2{
	MON("����һ"),TUE("���ڶ�"),WED("������");
	private String name;
	private Week2(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public String toString(){
		return name;
	}
}

enum Week3{
	MON("����һ"){

		@Override
		public void show() {
			System.out.println("����1");
		}
	},TUE("���ڶ�") {
		@Override
		public void show() {
			System.out.println("����2");
		}
	},WED("������") {
		@Override
		public void show() {
			System.out.println("����3");
		}
	};
	private String name;
	private Week3(String name){
		this.name = name;
	}
	public abstract void show();
}
