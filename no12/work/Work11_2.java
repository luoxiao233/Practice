class Work11_2 {
	public static void main(String[] args){
		int[] arr = {5,4,6,3,7,2,8,1,9};
		maoP(arr);
		print(arr);
	}
	public static void maoP(int[] arr){
		for (int i = 0;i < arr.length - 1 ;i ++ ) {
			for (int j = 1 + i;j < arr.length ;j++ ) {
				if (arr[i] < arr[j]) {
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