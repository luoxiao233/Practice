class Demo1_duixiang{
	public static void main(String[] args) {
		Person a = new Person();
		a.name = "天空";
		a.setAge(18);
		a.speak();
	}
}

class Person {
	String name;
	private int age;
	public void setAge(int a){
		if ( a > 0) {
			age = a ;
		}else {
			System.out.println("年龄不对");
		}
	}
	public int getAge(){
		return age;
	}
	public void speak(){
		System.out.println(age +"岁的"+ name);
	}
}
