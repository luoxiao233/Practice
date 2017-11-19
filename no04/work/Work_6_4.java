class Work_6_4{
	public static void main(String[] args) {
		//D:打印m行n列的星形矩形


		int m = 4,n = 5;
		for ( int i = 1;i <= m ;i++ ) {
			for (int j = 1;j <= n ;j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
