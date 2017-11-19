class Test1{
	public static void main(String[] args) {
		Zi a = new Zi();
	}
}
class Fu {
	static {
		System.out.println("父类静态方法");
	}
	{
		System.out.println("父类的构造方法");	
	}
	public Fu(){
		System.out.println("父类的空参构造");
	}
}
class Zi extends Fu{
	static {
		System.out.println("zi类静态方法");
	}
	{
		System.out.println("zi类的构造方法");	
	}
	public Zi(){
		System.out.println("zi类的空参构造");
	}
}
