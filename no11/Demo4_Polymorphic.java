/**
���ĵ���Ҫ˵���˶�̬�ĺô� ����Ҫ������˴����ά���ԣ������ɼ̳б�֤�ģ�������˴������չ�ԣ��ɶ�̬����֤�ģ���
��һ���ĵ�Ҳ˵���˶�̬�ı׶ˣ��Ǿ��ǲ���ֱ�ӵ�����������еķ��������뾭��ת��

�˽�instanceof  �ؼ��ʵ�ʹ��
������һ�㶼��ֱ�Ӵ�������Ķ���
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
* A:��̬�ĺô�
	* a:����˴����ά����(�̳б�֤)
	* b:����˴������չ��(�ɶ�̬��֤)
* B:������ʾ
	* ��̬�ĺô�(ʵ�ʿ����е�������ʹ��)
	* ���Ե�����ʽ���������Խ�������������� Peron p = new Superman();
* C:��̬�ı׶�
	* ����ֱ��ʹ��������������Ժ���Ϊ��
	ClassCastException
	instanceof: ǰ����Ǻ����һ�� 
	�����к����ڴ��������ʱ��,ʹ�ø�������ָ���������;
	��Ϊֱ�Ӵ����������,������.����ֱ��ʹ���������е����Ժ���Ϊ.
* D:������ʾ
	method(Animal a)
	method(Cat c)
*/

class Animal {
	public void eat() {
		System.out.println("����Է�");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("è����");
	}

	public void catchMouse() {
		System.out.println("׽����");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("������");
	}
	
	public void lookHome() {
		System.out.println("����");
	}

}

