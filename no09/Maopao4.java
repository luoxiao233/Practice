class Maopao4{
	public static void main(String[] args) {
		int[] arr = {1,3,2,6,5,8,7,4};
		paiXu(arr);
		print(arr);
	}
	public static void paiXu(int[] arr){
		for (int i = 0;i < arr.length - 1 ;i ++ ) {
			for (int j = 1 + i ;j < arr.length  ;j ++ ) {
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
