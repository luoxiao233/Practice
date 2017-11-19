class Demo2_Method{
	public static void main(String[] args) {
		Son s = new Son();
		System.out.println("----------------");
		Son s1 = new Son("haha",22);
		
	}
}
class Father {
	String name;
	int age;
	public Father(){
		System.out.println("这是父类的空参构造");
	}
	public Father(String name,int age){
		System.out.println("这是父类的有参构造");
	}
}
class Son extends Father{
	public Son(){
		System.out.println("这是子类的空参构造");
	}
	public Son(String name,int age){
		System.out.println("这是子类的有参构造");
	}
}
