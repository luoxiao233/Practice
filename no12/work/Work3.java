/**
3.创建类并创建对象并且使用对象属性和行为（举例写代码，分别使用private  set方法 get方法 构造方法（无参、有参）、super、this、abstract）；
*/


class Work3 {
	public static void main(String[] args){
		Animal a = new Cat();
		System.out.println(a.num);    //此处多态 成员变量 编译看左边，运行看左边。
		Animal a1 = new Cat("haha",3);
		a1.eat();                     //非静态方法 编译看左边，运行看右边
	}
}
abstract class Animal {
	private String name;
	private int age;
	public int num = 2;
	public Animal(){}
	public Animal(String name,int age){
		this.name = name;
		this.age = age;
	}
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
	public int num = 4;
	public Cat(){}
	public Cat(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("坐这里吃饭" + getName() + getAge());
	}
}