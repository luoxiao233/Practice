/**
此文档可简单的说，在多态继承中，只有成员方法编译看左边，运行看右边，  其他都是编译看左边，运行看左边
*/
class Demo2_Polymorphic{
	public static void main(String[] args) {
		/*
		获取类中的每个数据
		*/
		Father f = new Son();
		f.tall();                    //成员方法        编译看左边，运行看右边
		f.eat();                     //这是静态方法    编译看左边，运行看左边
		System.out.println(f.age);   //成员变量        编译看左边，运行看左边

		Son s = (Son)f;              //向下转变，   编译不用看，运行看本类。
		System.out.println(s.age);   //向下转变，   编译不用看，运行看本类。
		s.eat();                     //向下转变，   编译不用看，运行看本类。


		



		Father f1 = (Father)f;      
		f1.tall();
		f1.eat();
		//这是注意事项！！！ 这个还是相当于多态
		


	}
}
class Father{
	int age = 50;
	public void tall(){
		System.out.println("老子就是高");
	}
	public static void eat(){
		System.out.println("老子吃饭");
	}
}
class Son extends Father {
	int age = 20;
	public void tall(){
		System.out.println("小子很矮");
		super.tall();
	}
	public static void eat(){
		System.out.println("小子不吃饭只是喝奶");

	}
}
