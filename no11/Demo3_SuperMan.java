/**
此文档主要说明了 多态的弊端： 主要就是不能直接调用子类中特有的方法，  必须经历转型！
*/
class Demo3_SuperMan {
	public static void main(String[] args) {
		Person p = new SuperMan();	//父类引用指向子类对象
		System.out.println(p.name);	//调用成员变量
		p.talkBuz();				//调用(非静态的)成员方法

		SuperMan sm  = (SuperMan)p;
		sm.fly();
		//p.fly(); 多态的弊端:不能直接调用子类的特有的方法;解决:使用转型
		/*
		基本数据类型:自动类型提升和强制类型转换
		父类引用指向子类对象其实就是向上转型
		向下转型的一个前提向上转型

		*/

		int i = 10;
		byte b = 20;
		//i = b;			//自动类型提升
		b = (byte)i;		//强制类型转换
	}
}

class Person {
	String name = "John";
	public void talkBuz() {
		System.out.println("谈生意");
	}
}

class SuperMan extends Person {
	String name = "SuperMan";
	public void talkBuz() {
		System.out.println("谈几个亿的大生意");
	}

	public void fly() {
		System.out.println("飞身救人");
	}
}
