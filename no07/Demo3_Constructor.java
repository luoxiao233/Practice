class Demo3_Constructor{
	public static void main(String[] args) {
		Phone p = new Phone();
		Phone p1 = new Phone("huawei",1234);
		p.show();
		p1.show();
	}
}
class Phone {
	String brand;
	int price;
	public Phone(){
		brand = "pingguo";
		price = 8999;
	}
	public Phone(String brand,int price){
		this.brand = brand;
		this.price = price;
	}
	public void show(){
		System.out.println(brand + " €º€" + price);
	}
}
