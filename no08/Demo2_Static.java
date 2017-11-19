class Demo2_Static{
	public static void main(String[] args) {
		Demo d = new Demo();
		d.print1();
		Demo.print2();
	}
}
class Demo {
	int num1 = 10;
	static int num2 = 20 ;
	public void print1(){
		System.out.println(num1);
		System.out.println(num2);
	}
	public static void print2(){
		//System.out.println(num1);  这个是不可以访问的，静态的只能调用静态的
		System.out.println(num2);
	}
}
