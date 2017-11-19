class Return1{
	public static void main(String[] args) {
		for (int i = 1;i <= 10 ;i ++ ) {
			if (i == 5) {
				return;//直接结束方法
			}
			System.out.println(i);
		}	
	}
}
