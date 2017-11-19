class Demo6_Phone{
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.setColor("red");
		p1.setPrice(999);
		System.out.println(p1.getColor() + p1.getPrice());

		Phone p2 = new Phone("white",888);
		p2.show();
	}
}
class Phone {
	private String color;
	private int price;
	public Phone(){}
	public Phone(String color,int price){
		this.color = color;
		this.price = price;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	public void show(){
		System.out.println(color + price);
	}

}
