class Work2{
	public static void main(String[] args) {
		//2:һά����Ķ����ʽ?
		//��������[] ������ = new ��������[����ĳ���];
		//��������[] ������ = {};
		
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
