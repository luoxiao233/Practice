/**
3.�����ಢ����������ʹ�ö������Ժ���Ϊ������д���룬�ֱ�ʹ��private  set���� get���� ���췽�����޲Ρ��вΣ���super��this��abstract����
*/


class Work3 {
	public static void main(String[] args){
		Animal a = new Cat();
		System.out.println(a.num);    //�˴���̬ ��Ա���� ���뿴��ߣ����п���ߡ�
		Animal a1 = new Cat("haha",3);
		a1.eat();                     //�Ǿ�̬���� ���뿴��ߣ����п��ұ�
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
		System.out.println("������Է�" + getName() + getAge());
	}
}