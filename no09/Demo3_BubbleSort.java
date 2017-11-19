class Demo3_BubbleSort{
	public static void main(String[] args) {
		int[] arr = {2,3,4,6,7,1};
		bubbleSort1(arr);
	}
	public static void bubbleSort1(int[] arr){
		for (int i = 0;i < arr.length -1 ;i ++ ) {
			for (int j = 1 + i;j < arr.length - 1 ;j++ ) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i =0;i < arr.length ;i ++ ) {
			System.out.print(arr[i] + " ");
		}
	}
}
