class Demo1_interface{
	public static void main(String[] args) {
		Inter n = new Demo1();
		n.eat();
	}
}
interface Inter {
	abstract public void eat();
} 
class Demo1 implements Inter {
	public void eat(){
		System.out.println("³Ô¶«Î÷");
	}
}

