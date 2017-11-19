class Array2{
	public static void main(String[] args) {
		int[] arr = {11,33,9,67,90};
		int min = arr[0];
		for (int i = 1;i < arr.length ; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}	
		}
		System.out.println(min);
	}
}
