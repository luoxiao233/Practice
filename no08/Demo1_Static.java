class Demo1_Static{
	public static void main(String[] args) {
		Person.nation = "�й�";
		System.out.println(Person.nation);
	}
}
class Person {
	String name;
	static String nation;

	public void show(){
		System.out.println(name + nation);
	}
}
