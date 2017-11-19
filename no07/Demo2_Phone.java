class Demo2_Phone{
	public static void main(String[] args) {
		Phone p = new Phone();
		String b = "pingguo";

		p.setBrand(b);
		p.setPrice(8999);
		System.out.println(p.getBrand());
		System.out.println(p.getPrice());
	}
}
class Phone {
	private String brand;
	private int price;
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
		return price;
	}



	public void call(){
		System.out.println("打电话");
	}
	public void sendMessage(){
		System.out.println("发短信");
	}
	public void playGame(){
		System.out.println("玩游戏");
	}
}
