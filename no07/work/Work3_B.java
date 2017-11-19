class Work3_B{
	public static void main(String[] args) {
		//B:手机类的案例

		Phone p = new Phone();
		p.setBrand("水果");
		p.setPrice(666);
		p.gui();

		Phone p1 = new Phone("huawei",888);
		p1.gui();
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
		this.price = price;
	}
	public int getPrice(){
		return price ;
	}
	public void gui(){
		System.out.println(brand + "牌子价格" + price);
	}
}
