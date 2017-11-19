class Test1{
	public static void main(String[] args) {
		Animal a = new Cat();
		a.eat();
		Cat c = (Cat)a;
		c.catc();
		Animal d = new Dog();
		d.eat();
		Dog d1 = (Dog)d;
		d1.look();
	}
}
abstract class Animal {
	private String name;
	private int age;
	public Animal(){}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	abstract public void eat();
}
class Cat extends Animal {
	public void eat(){
		System.out.println("√®≥‘∑π");
	}
	public void catc(){
		System.out.println("√®◊•¿œ Û");
	}
}
class Dog extends Animal {
	public void eat(){
		System.out.println("π∑≥‘∑π");
	}
	public void look(){
		System.out.println("π∑ø¥º“");
	}
}