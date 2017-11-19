class Work2{
	public static void main(String[] args) {
		//2:一维数组的定义格式?
		//数据类型[] 数组名 = new 数据类型[数组的长度];
		//数据类型[] 数组名 = {};
		
		int[] arr1 = {1,2,3,4,5,6};
		for (int i = 0;i< arr1.length ;i++ ) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		int[] arr = new int[5];
		for (int i = 0;i< arr.length ;i++ ) {
			System.out.print(arr[i] + " ");
		}
	}
}
