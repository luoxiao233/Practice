class Demo2_Method{
	public static void main(String[] args) {
		Son s = new Son();
		System.out.println("----------------");
		Son s1 = new Son("haha",22);
		
	}
}
class Father {
	String name;
	int age;
	public Father(){
		System.out.println("���Ǹ���Ŀղι���");
	}
	public Father(String name,int age){
		System.out.println("���Ǹ�����вι���");
	}
}
class Son extends Father{
	public Son(){
		System.out.println("��������Ŀղι���");
	}
	public Son(String name,int age){
		System.out.println("����������вι���");
	}
}
