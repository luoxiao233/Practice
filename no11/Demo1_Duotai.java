class Demo1_Duotai{
	public static void main(String[] args) {
		Animal a = new Cat();
		a.eat();
		a.sleep();
		System.out.println(a.age);
	}
}
class Animal {
	int age = 10;
	public  void eat(){
		System.out.println("³ÔÈË");
	}
	public static void sleep(){
		System.out.println("Ë¯¾õ1");
	}
}
class Cat extends Animal {
	int age = 20;
	public static void sleep(){
		System.out.println("Ë¯¾õ2");
	}
	public void eat(){
		System.out.println("Ê²Ã´¶¼³Ô");
	}
}
