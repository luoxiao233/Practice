class Demo7_Rectangle{
	public static void main(String[] args) {
		Rectangle r = new Rectangle(4,6);
		System.out.println(r.getLength());
		System.out.println(r.getArea());
		Rectangle r1 = new Rectangle();
		r1.setWidth(9);
		r1.setHeight(10);
		System.out.println(r1.getLength());
		System.out.println(r1.getArea());
	}
}
class Rectangle {
	private int width;
	private int height;
	public Rectangle(){}
	public Rectangle(int width,int height){
		this.width = width;
		this.height = height;
	}
	public void setWidth(int width){
		this.width = width;
	}
	public void setHeight(int height){
		this.height = height;
	}
	public int getLength(){
		return (width + height) * 2;
	}
	public int getArea(){
		return width * height;
	}
}
