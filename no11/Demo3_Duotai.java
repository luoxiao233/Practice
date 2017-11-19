class Demo3_Duotai{
	public static void main(String[] args) {
		method(new Cat());
		method(new Dog());
		method(new Cat());
		method(new Animal());
	}
	public static void method(Animal a){
		if ( a instanceof Cat) {
			Cat c = (Cat)a;
			c.fly();
		}else if (a instanceof Dog) {
			Dog d = (Dog)a;
			d.eat();
		}else{
			a.eat();
		}
	}
}
class Animal {
	public void eat(){
		System.out.println("�Զ���");
	}
}
class Cat extends Animal {
	public void eat(){
		System.out.println("è��");
	}
	public void fly(){
		System.out.println("�ܷ�");
	}
}
class Dog extends Animal {
	public void eat(){
		System.out.println("����");
	} 
}
