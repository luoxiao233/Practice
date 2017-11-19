class Demo1_Code{
	static {
		System.out.println("测试类中的静态代码块 才是绝对的第一次执行，而且还只是一次");
	}
	public static void main(String[] args) {
		{
			System.out.println("主方法中的代码块 " + "first  反正就是最先执行");
		}
		Student s = new Student();
		s.age = 20;
		System.out.println(s.age);
		System.out.println("---------------------------");
		Student s1 = new Student();
		s1.age = 22;
		System.out.println(s1.age);
	}
}
class Student {
	static {
		System.out.println("创建类中方法外的静态代码块：创建对象就执行，只加载一次，后面不再加载");
	}
	{
		System.out.println("创建类中方法外代码块：创建一个对象就执行以此，最后执行");
	}
	int age ;
}
