class Demo1_BinarySearch{
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9};
		System.out.println(getIndex(arr,5));
	}
	public static int getIndex(int[] arr,int value){
		int min = 0;
		int max = arr.length - 1;
		int mid = (min + max) / 2;

		while (arr[mid] != value) {
			if (arr[mid] > value) {
				max = mid - 1;
				mid = (min + max) / 2;
			}else if (arr[mid] < value) {
				min = mid + 1;
				mid = (min + max) / 2;
			}		
			if (min > max) {
				return -1;
			}
		}
		return mid;
	}
}
