class Work3_A{
	public static void main(String[] args) {
		/*
		A:ѧ����İ���
		*/
		Student a = new Student();
		a.name = "С����";
		a.setAge(23);
		a.learn();

		Student b = new Student("����",44);
		b.learn();
		b.setAge(40);
		System.out.println("��ʵ������" + b.getAge());

	}
}
class Student {
	String name ;
	private int age;
	public Student(){}
	public Student(String name,int age){
		this.name = name ;
		this.age = age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void learn(){
		System.out.println(name + "����------" + age);
	}
}
