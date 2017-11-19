class Demo3_Phone{
	public static void main(String[] args) {
		Ios8 a = new Ios8();
		a.speak();
	}
}
class Ios7 {
	public void call(){
		System.out.println("大电话");
	}
	public void speak(){
		System.out.println("说英语");
	}
}
class Ios8 extends Ios7 {
	public void speak(){
		super.speak();
		System.out.println("说汉语了");
	}
}

