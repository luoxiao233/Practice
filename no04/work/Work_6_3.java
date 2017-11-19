class Work_6_3{
	public static void main(String[] args) {
		//C:获取两个数中较大的值
		int c = getMax(4,6);
		System.out.println(getMax(4,5));
		System.out.println(c);
	}
	public static int getMax(int a,int b){
		return a > b ? a : b ;
	}
}
