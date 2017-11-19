class For4{
	public static void main(String[] args) {
		int sum = 0 ;
		for (int i=100; i<=999 ; i++) {
			int x = i % 10;
			int y = i /10 % 10;
			int z = i /10 /10 % 10;
			if (i == x * x * x + y * y * y + z * z * z) {
				sum++;
				System.out.println(i);
			}
			
		}
		System.out.println(sum);
	}
}
