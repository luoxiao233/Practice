class Work4{
	public static void main(String[] args) {
		/*
			4:数组常见操作:
			数组遍历(依次输出数组中的每一个元素)
			数组获取最值(获取数组中的最大值最小值)
			数组元素逆序 (就是把元素对调)
			数组查表法(根据键盘录入索引,查找对应星期)
			数组元素查找(查找指定元素第一次在数组中出现的索引)
		*/
		int[] arr = {2,1,3,4,5,6,7,9,8};
		for (int i = 0;i < arr.length ;i++ ) {
			System.out.print(arr[i] + " ");
		}                      
		System.out.println();//数组遍历


		int max = arr[0];
		for (int i = 0;i < arr.length ;i++ ) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
		System.out.println();//取出最大值


		int min = arr[0];
		for (int i = 0;i < arr.length ;i++ ) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
		System.out.println();//取出最小值
		

		reverseArray(arr); //反转数组
		printArray(arr);    // 打印 反转数组

			
	}




	public static void reverseArray(int[] arr){
		for (int i = 0;i < arr.length / 2;i++ ) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		}
	public static void printArray(int[] arr){
		for (int i = 0;i < arr.length ;i++ ) {
			System.out.print(arr[i] + " ");
		}
	}
	
}
