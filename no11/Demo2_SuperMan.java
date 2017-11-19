class Demo2_SuperMan{
	public static void main(String[] args) {
		Person p = new SuperMan();
		System.out.println(p.name);
		p.talk();
		SuperMan sm = (SuperMan)p;
		sm.fly();
	}
}
class Person {
	String name = "小名";
	public void talk(){
		System.out.println("谈生意");
	}
}
class SuperMan extends Person {
	String name = "牛逼";
	public void talk(){
		System.out.println("谈的是超级生意");
	}
	public void fly(){
		System.out.println("我要飞");
	}
}
