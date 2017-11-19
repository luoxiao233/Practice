/**
10:继承案例练习

*/
class Work10 {
	public static void main(String[] args){
		Student s = new Student();
		s.study();
		Teacher t = new Teacher();
		t.teach();
	}
}
class Person {
	private String name;
	private int age;
	public Person(){}
	public Person(String name,int age){
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
	public void show(){
		System.out.println(name + "----------" + age);
	}
}
class Student extends Person{
	public void study(){
		
		System.out.println("我就是要学习" );
	}
}
class Teacher extends Person{
	public void teach(){
		System.out.println("教书育人");
	}
}