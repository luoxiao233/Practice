class Demo1_Polymorphic{
	public static void main(String[] args) {
		Person p = new Student();
		p.eat();
	}
	/*
	��̬��ǰ�᣺
	1.�����м̳еĸ��ӹ�ϵ
	2.�����з�������д
	3.�����и�������ָ���������
	*/
}
class Person {
	public void eat(){
		System.out.println("�Է�");
	}
}
class Student extends Person {
	public void eat(){
		System.out.println("ѧ�����ܳ���");
	}
}
