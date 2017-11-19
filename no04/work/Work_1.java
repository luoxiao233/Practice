class Work_1{
	public static void main(String[] args) {
		int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
		for (int i = 1;i <= 10 ;i++ ) {
			sum1 = sum1 + i;
		}
		System.out.println(sum1);
		System.out.println("-------------");


		for (int j =1 ; j <= 100;j++ ) {
			if (j % 2 == 0) {
				sum2 = sum2 + j;
			}
		}
		System.out.println(sum2);
		System.out.println("-------------");


		for (int m = 1;m <= 20 ;m ++ ) {
			if (m % 2 == 1) {
				sum3 += m;
			}
		}
		System.out.println(sum3);
		System.out.println("-------------");


		for (int s = 100;s <= 999 ;s++ ) {
			int x = s % 10 ;
			int y = s / 10 % 10;
			int z = s / 100 % 10;
			if (s == x * x * x + y * y * y + z * z * z) {
				sum4 ++;
				System.out.println(s);
			}
		}
		System.out.println("出现了" + sum4 + "次");
		System.out.println("-------------");

		for (int w = 1;w <= 9 ;w++ ) {
			for (int e = 1;e <= w ;e++ ) {
				System.out.print(w + "*" + e + "=" + e * w + "\t");
			}
			System.out.println();
		}
	}
}
