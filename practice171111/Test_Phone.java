class Test_Phone{
	public static void main(String[] args) {
		Phone p = new Phone();
		p.setBrand("xiaomi");
		p.setPrice(999);
		p.show();

		Phone p1 = new Phone("pingguo",1111);
		p1.show();
	}
}
class Phone {
	private String brand;
	private int price;
	public Phone(){}
	public Phone(String brand,int price){
		this.brand = brand;
		this.price = price;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setPrice(int price){
		this.price  = price;
	}
	public int getPrice(){
		return price;
	}
	public void show(){
		System.out.println(brand + "----" + price);
	}
}
