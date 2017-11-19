class Case_B{
	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.setColor("black");
		c1.setNum(4);
		System.out.println(c1.getNum() + c1.getColor());

		Cat c2 = new Cat("hello",4);
		System.out.println(c2.getNum() + c2.getColor());
		c2.eat();
		c2.catMouse();

	}
}
class Animal {
	private String color;
	private int num;

	public Animal(){}
	public Animal(String color,int num){
		this.color = color;
		this.num = num;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public void setNum(int num){
		this.num = num;
	}
	public int getNum(){
		return num;
	}
	public void eat(){
		System.out.println("∂ØŒÔ≥‘∑π");
	}
}
class Cat extends Animal {
	public Cat(){}
	public Cat(String color,int num){
		super(color,num);
	}
	public void eat(){
		System.out.println("√®≥‘”„");
	}
	public void catMouse(){
		System.out.println("√®◊Ω¿œ Û");
	}
}
class Dog extends Animal {
	public Dog(){}
	public Dog(String color,int num){
		super(color,num);
	}
	public void eat(){
		System.out.println("π∑≥‘»‚");
	}
	public void lookHome(){
		System.out.println("ø¥º“");
	}
}