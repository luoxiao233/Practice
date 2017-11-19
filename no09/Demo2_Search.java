class Demo2_Search{
	public static void main(String[] args) {
		int[] arr ={1,2,3,4,5,6,7,8};
		System.out.println(search(arr,8));
	}
	public static int search(int[] arr,int value){
		int min = 0;
		int max = arr[arr.length - 1];
		int mid = (min + max) / 2;
		while (arr[mid] != value) {
			if (arr[mid] > value) {
				max = mid -1;
			}else if (arr[mid] < value) {
				min = mid +1;
			}
			mid = (min + max) / 2;
			if (min > max) {
				return -1;
			}
		}
		return mid;
	}
}
