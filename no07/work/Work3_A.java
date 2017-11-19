class Work3_A{
	public static void main(String[] args) {
		//A:学生类的案例
		Student s = new Student();
		s.setName("小王");
		s.setAge(18);
		s.learn();

		Student s1 = new Student("三毛",20);
		s1.learn();
	}
}
class Student {
	private String name;
	private int age;
	public Student(){}
	public Student(String name,int age){
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
	public void learn(){
		System.out.println(name + "怀念"+ age+ "岁");
	}
}
