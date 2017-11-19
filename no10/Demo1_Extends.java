class Demo1_Extends{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.color = "ºÚÉ«";
		d.num = 4;
		d.show();
	}
}
class Animal {
	String color ;
	int num;
	public void eat(){
		System.out.println("³Ô·¹");
	}
	public void sleep(){
		System.out.println("Ë¯¾õ");
	}
	public void show(){
		System.out.println(color + num);
	}
}
class Dog extends Animal {
}
class Cat extends Animal {
}
