class Demo4_Constructor{
	public static void main(String[] args) {
		Person p = new Person();
		Person p1 = new Person("ÍõÎå",25);
		p.setName("ÕÔÁù");
		System.out.println(p.getName());
		System.out.println(p1.getName());

	}
}
class Person {
	private String name;
	private int age;
	public Person(){
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
}
