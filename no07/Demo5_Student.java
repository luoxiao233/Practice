class Demo5_Student{
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("王五");
		s.setAge(25);
		s.show();
		Student s1 = new Student("李四"，24);


	}
}
class Student {
	private String name;
	private int age;
	public Student(){
	
	}
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void show(){
		System.out.println(name + "已经" + age);
	}
}
