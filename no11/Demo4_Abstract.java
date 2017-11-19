class Demo4_Abstract{
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
	}
}
abstract class Animal {
	public abstract void eat();
}
class Cat extends Animal {
	public void eat(){
		System.out.println("³Ô");
	}
}
