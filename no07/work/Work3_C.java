class Work3_C{
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setWidth(3);
		r.setHeight(8);
		System.out.println(r.getLength());

		Rectangle r1 = new Rectangle(8,9);
		System.out.println(r1.getArea());
		
	}
}
class Rectangle {
	private int width;
	private int height;
	public Rectangle(){}
	public Rectangle(int width,int height){
		this.width = width ;
		this.height = height;
	}
	public void setWidth(int width){
		this.width = width;
	}
	public int getWidth(){
		return width;
	}
	public void setHeight(int height){
		this.height = height;
	}
	public int getHeight(){
		return height;
	}
	public int getLength(){
		return (width + height) * 2 ;
	}
	public int getArea(){
		return width * height ;
	}
}
