class Demo2_interface{
	public static void main(String[] args) {
		Inter q = new Demo();
		q.print();
	}
}
interface Inter {
	public static final int num = 10;
	abstract public void print();
}
class Demo implements Inter{
	public void print(){
		System.out.println("Êä³öµãÊ²Ã´" + num);
	}
}