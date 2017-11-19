class Work11_3 {
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(twoF(arr,6));
	}
	public static int twoF(int[] arr,int value){
		int min = 0 ;
		int max = arr.length - 1;
		int mid = (min + max) / 2;
		while (value != arr[mid]) {
			if (value < arr[mid]) {
				max = mid - 1;
			}else if (value > arr[mid]) {
				min = mid + 1;
			}
			mid = (min + max) / 2;
			if (min > max) {
				return -1;
			}
		}
		return mid;
	}
}