class While1{
	public static void main(String[] args) {
		int i =1,sum = 0 ;
		while (i <=100) {
			sum = sum+i;
			i++;
		}
		System.out.println(sum);
		int n = 0,x = 100;
		while (x <=999) {
			int ge = x % 10;
			int shi = x /10 % 10;
			int bai = x /10 /10 % 10;
			if(x == ge * ge *ge +bai * bai * bai + shi * shi * shi){
				n++;
			} 
			x++;
		}
		System.out.println(n);

	}
}
