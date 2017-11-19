class Work3_A{
	public static void main(String[] args) {
		/*
		A:学生类的案例
		*/
		Student a = new Student();
		a.name = "小李子";
		a.setAge(23);
		a.learn();

		Student b = new Student("老王",44);
		b.learn();
		b.setAge(40);
		System.out.println("其实老王才" + b.getAge());

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
		System.out.println(name + "哈哈------" + age);
	}
}
