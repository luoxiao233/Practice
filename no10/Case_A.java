class Case_A{
	public static void main(String[] args) {
		Student s = new Student();
		Teacher t = new Teacher();
		Student s1 = new Student("1s",23);
		Teacher t1 = new Teacher("1t",50);
	}
}
class Person {
	private String name;
	int age;
	public Person(){
		System.out.println("父类的无参构造");
	}
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
	public void eat(){
		System.out.println("吃饭");
	}
}
class Student extends Person {
	public Student(){
		System.out.println("子类学生的无参构造");
	}
	public Student(String name,int age){
		System.out.println(name + age + "学习");
	}
}
class Teacher extends Person {
	public Teacher(){
		System.out.println("子类老师的无参构造");
	}
	public Teacher(String name,int age){
		System.out.println(name + "gbei" + age + "还要讲课");
	}
	public void speak(){
		super.eat();
		System.out.println("讲课");
	}
}
