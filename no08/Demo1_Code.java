class Demo1_Code{
	static {
		System.out.println("�������еľ�̬����� ���Ǿ��Եĵ�һ��ִ�У����һ�ֻ��һ��");
	}
	public static void main(String[] args) {
		{
			System.out.println("�������еĴ���� " + "first  ������������ִ��");
		}
		Student s = new Student();
		s.age = 20;
		System.out.println(s.age);
		System.out.println("---------------------------");
		Student s1 = new Student();
		s1.age = 22;
		System.out.println(s1.age);
	}
}
class Student {
	static {
		System.out.println("�������з�����ľ�̬����飺���������ִ�У�ֻ����һ�Σ����治�ټ���");
	}
	{
		System.out.println("�������з��������飺����һ�������ִ���Դˣ����ִ��");
	}
	int age ;
}
