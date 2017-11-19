/**
此文档主要说明了多态的好处 ，主要是提高了代码的维护性（这是由继承保证的），提高了代码的扩展性（由多态来保证的）。
上一个文档也说明了多态的弊端，那就是不能直接调用子类的特有的方法，必须经过转型

了解instanceof  关键词的使用
开发中一般都是直接创建子类的对象
*/
class Demo4_Polymorphic {
	public static void main(String[] args) {
		/*Animal a = new Cat();
		a.eat();
		Animal a2 = new Cat();
		a2.eat();*/

		method(new Cat());  //0x0011
		method(new Cat());
		method(new Dog());
	}
	public static void method(/*Cat c*/ Animal a) {  //Animal a = new Dog();   Animal a = new Cat()
		/*a.eat();
		//a.catchMouse();
		Cat c = (Cat)a;
		c.catchMouse();*/
		if (a instanceof Cat) {
			a.eat();
			Cat c = (Cat)a;
			c.catchMouse();
		} else if (a instanceof Dog) {
			a.eat();
			Dog d = (Dog)a;
			d.lookHome();
		} else {
			a.eat();
		}

	}
}
/*
* A:多态的好处
	* a:提高了代码的维护性(继承保证)
	* b:提高了代码的扩展性(由多态保证)
* B:案例演示
	* 多态的好处(实际开发中当作参数使用)
	* 可以当作形式参数，可以接收任意子类对象 Peron p = new Superman();
* C:多态的弊端
	* 不能直接使用子类的特有属性和行为。
	ClassCastException
	instanceof: 前面的是后面的一种 
	开发中很少在创建对象的时候,使用父类引用指向子类对象;
	因为直接创建子类对象,更方便.可以直接使用子类特有的属性和行为.
* D:案例演示
	method(Animal a)
	method(Cat c)
*/

class Animal {
	public void eat() {
		System.out.println("动物吃饭");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}

	public void catchMouse() {
		System.out.println("捉老鼠");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("狗吃肉");
	}
	
	public void lookHome() {
		System.out.println("看家");
	}

}

