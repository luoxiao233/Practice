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
	MON("星期一"),TUE("星期二"),WED("星期三");
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
	MON("星期一"){

		@Override
		public void show() {
			System.out.println("星期1");
		}
	},TUE("星期二") {
		@Override
		public void show() {
			System.out.println("星期2");
		}
	},WED("星期三") {
		@Override
		public void show() {
			System.out.println("星期3");
		}
	};
	private String name;
	private Week3(String name){
		this.name = name;
	}
	public abstract void show();
}
