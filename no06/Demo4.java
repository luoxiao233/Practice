class Demo4 {
	public static void main(String[] args){
		Phone p = new Phone();
		p.brand = "pingguo";
		p.price = 998;
		System.out.println(p.brand);
		p.call();
		p.sendMassage();
	}
}
class Phone{
	String brand ;
	int price;
	public void call() {
		System.out.println("��绰");
	}
	public void sendMassage() {
		System.out.println("����");
	}
	public void playGame() {
		System.out.println("����Ϸ");
	}
}
