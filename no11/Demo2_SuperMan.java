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
	String name = "С��";
	public void talk(){
		System.out.println("̸����");
	}
}
class SuperMan extends Person {
	String name = "ţ��";
	public void talk(){
		System.out.println("̸���ǳ�������");
	}
	public void fly(){
		System.out.println("��Ҫ��");
	}
}
