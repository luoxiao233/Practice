/**
���ĵ��ɼ򵥵�˵���ڶ�̬�̳��У�ֻ�г�Ա�������뿴��ߣ����п��ұߣ�  �������Ǳ��뿴��ߣ����п����
*/
class Demo2_Polymorphic{
	public static void main(String[] args) {
		/*
		��ȡ���е�ÿ������
		*/
		Father f = new Son();
		f.tall();                    //��Ա����        ���뿴��ߣ����п��ұ�
		f.eat();                     //���Ǿ�̬����    ���뿴��ߣ����п����
		System.out.println(f.age);   //��Ա����        ���뿴��ߣ����п����

		Son s = (Son)f;              //����ת�䣬   ���벻�ÿ������п����ࡣ
		System.out.println(s.age);   //����ת�䣬   ���벻�ÿ������п����ࡣ
		s.eat();                     //����ת�䣬   ���벻�ÿ������п����ࡣ


		



		Father f1 = (Father)f;      
		f1.tall();
		f1.eat();
		//����ע��������� ��������൱�ڶ�̬
		


	}
}
class Father{
	int age = 50;
	public void tall(){
		System.out.println("���Ӿ��Ǹ�");
	}
	public static void eat(){
		System.out.println("���ӳԷ�");
	}
}
class Son extends Father {
	int age = 20;
	public void tall(){
		System.out.println("С�Ӻܰ�");
		super.tall();
	}
	public static void eat(){
		System.out.println("С�Ӳ��Է�ֻ�Ǻ���");

	}
}
