class Work5{
	public static void main(String[] args) {
		/*
		5:如何使用一个类的成员
		对象名.成员
		*/
		Student s = new Student();
		s.name = "隔壁老王";
		System.out.println(s.name);
	}
}
class Student {
	String name;
}
