class Break1{
	public static void main(String[] args) {
		//只能在switch和循环中跳出
		for (int i = 1;i <= 10 ;i++ ) {
			if (i == 4) {
				break;//跳出循环
			}
			System.out.println(i);
		}
	}
}
