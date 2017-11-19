class Test1{
	public static void main(String[] args) {
		System.out.println(compar(5.0,5.1));
	}
	public static boolean compar(int a,int b){
		return a == b ? true : false;
	}
	public static boolean compar(double a,double b){
		return a == b ;//老师的写法
	}
}
