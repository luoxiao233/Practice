class Demo5_Abstract{
	public static void main(String[] args) {
		Demo c = new Cat();
		c.eat();
		//System.out.println(num1);
	}
}
abstract class Demo {
	int num1 = 10;
	final int num2 = 20 ;
	public Demo(){
		System.out.println("父类构造方法");
	}
	abstract public void eat();
}
class Cat extends Demo {
	public void eat(){
		System.out.println("吃东西");
	}
}
