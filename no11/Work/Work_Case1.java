/*
* A:案例演示   (抽象类练习老师案例)
	* 具体事物：基础班老师，就业班老师
	* 共性：姓名，年龄，讲课
	* 具体事物：基础班学生，就业班学生
	* 共性：姓名，年龄，学习
*/
class Work_Case1{
	public static void main(String[] args) {
		Teacher t = new JavaEE();
		t.setName("zhangsan");
		t.setAge(23);
		t.teach();

		Teacher t1 = new JavaEE("lisi",24);
		t1.teach();

		JavaEE j1 = (JavaEE)t;
		j1.kuangJia();
	}
}
class Person{
	private String name;
	private int age;
	public Person(){}
	public Person(String name,int age){
		this.name = name;
		this.age =age;
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
}
abstract class Teacher extends Person {
	public Teacher(){}
	public Teacher(String name,int age){
		super(name,age);
	}
	abstract public void teach();
}
class JavaEE extends Teacher {
	public JavaEE(){}
	public JavaEE(String name,int age){
		super(name,age);
	}
	public void teach(){
		System.out.println("不知道教什么" + getName() + "`````" + getAge());
	}
	public void kuangJia(){
		System.out.println("后面会讲些框架");
	}
}
abstract class Student extends Person {
	public Student(){}
	public Student(String name,int age){
		super(name,age);
	}
	abstract public void study();
class J extends Student {
	public J(){}
	public J(String name,int age){
		super(name,age);
	}
	public void study(){
		System.out.println("随便学");
	}
}
}
