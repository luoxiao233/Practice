/**
���ĵ���Ҫ˵���� ��̬�ı׶ˣ� ��Ҫ���ǲ���ֱ�ӵ������������еķ�����  ���뾭��ת�ͣ�
*/
class Demo3_SuperMan {
	public static void main(String[] args) {
		Person p = new SuperMan();	//��������ָ���������
		System.out.println(p.name);	//���ó�Ա����
		p.talkBuz();				//����(�Ǿ�̬��)��Ա����

		SuperMan sm  = (SuperMan)p;
		sm.fly();
		//p.fly(); ��̬�ı׶�:����ֱ�ӵ�����������еķ���;���:ʹ��ת��
		/*
		������������:�Զ�����������ǿ������ת��
		��������ָ�����������ʵ��������ת��
		����ת�͵�һ��ǰ������ת��

		*/

		int i = 10;
		byte b = 20;
		//i = b;			//�Զ���������
		b = (byte)i;		//ǿ������ת��
	}
}

class Person {
	String name = "John";
	public void talkBuz() {
		System.out.println("̸����");
	}
}

class SuperMan extends Person {
	String name = "SuperMan";
	public void talkBuz() {
		System.out.println("̸�����ڵĴ�����");
	}

	public void fly() {
		System.out.println("�������");
	}
}
