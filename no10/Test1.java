class Test1{
	public static void main(String[] args) {
		Zi a = new Zi();
	}
}
class Fu {
	static {
		System.out.println("���ྲ̬����");
	}
	{
		System.out.println("����Ĺ��췽��");	
	}
	public Fu(){
		System.out.println("����Ŀղι���");
	}
}
class Zi extends Fu{
	static {
		System.out.println("zi�ྲ̬����");
	}
	{
		System.out.println("zi��Ĺ��췽��");	
	}
	public Zi(){
		System.out.println("zi��Ŀղι���");
	}
}
