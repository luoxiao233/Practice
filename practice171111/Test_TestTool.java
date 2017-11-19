class Test_TestTool{
	public static void main(String[] args) {
		ArrayTool x = new ArrayTool();
		int[]arr = {1,2,3,4,5,6,7,8,9};
		x.getMax(arr);
		x.printArr(arr);
		System.out.println();
		x.reverseArr(arr);
		x.printArr(arr);

	}
}
class ArrayTool {
	public static void getMax(int[] arr){
		int max = 0;
		for ( int i = 0;i < arr.length ;i ++ ) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
	public static void printArr(int[] arr){
		for (int i = 0;i < arr.length ;i ++ ) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void reverseArr(int[] arr){
		for (int i = 0;i < arr.length / 2 ; i ++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}
}

