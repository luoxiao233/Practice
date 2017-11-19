class xuanZePaiXun{
	public static void main(String[] args) {
		int[] arr = {3,5,2,6};
		bj(arr);
		print(arr);
		
	}
	public static void bj(int[] arr){
		for (int i = 0 ;i < arr.length -1  ; i ++) {
			for (int j = i + 1; j < arr.length;j ++ ) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}	
	}
	public static void print(int[] arr){
		for (int i = 0;i < arr.length ;i ++ ) {
			System.out.print(arr[i] + " ");
		}
	}
}
