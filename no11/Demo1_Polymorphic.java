class Demo1_Polymorphic{
	public static void main(String[] args) {
		Person p = new Student();
		p.eat();
	}
	/*
	多态的前提：
	1.必须有继承的父子关系
	2.必须有方法的重写
	3.还得有父类引用指向子类对象
	*/
}
class Person {
	public void eat(){
		System.out.println("吃饭");
	}
}
class Student extends Person {
	public void eat(){
		System.out.println("学生不能吃肉");
	}
}
