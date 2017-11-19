class Continue1{
	public static void main(String[] args) {
		for (int i = 1;i <=10 ;i++ ) {
			if (i == 4) {
				continue;//终止本次循环，执行下次循环
			}
			System.out.println(i);//显示 1235678910
		}
		
	}
}
