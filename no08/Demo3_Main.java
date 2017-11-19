class Demo3_Main{
	public static void main(String[] args) {
		Demo3_Main m = new Demo3_Main();
		m.method1();
		Demo3_Main.method2();
		method2();
	}
	public void method1(){
		System.out.println("never");
	}
	public static void method2(){
		System.out.println("give up");
	}
}
