class Work4{
	public static void main(String[] args) {
		/*
			4:���鳣������:
			�������(������������е�ÿһ��Ԫ��)
			�����ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)
			����Ԫ������ (���ǰ�Ԫ�ضԵ�)
			������(���ݼ���¼������,���Ҷ�Ӧ����)
			����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
		*/
		int[] arr = {2,1,3,4,5,6,7,9,8};
		for (int i = 0;i < arr.length ;i++ ) {
			System.out.print(arr[i] + " ");
		}                      
		System.out.println();//�������


		int max = arr[0];
		for (int i = 0;i < arr.length ;i++ ) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
		System.out.println();//ȡ�����ֵ


		int min = arr[0];
		for (int i = 0;i < arr.length ;i++ ) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
		System.out.println();//ȡ����Сֵ
		

		reverseArray(arr); //��ת����
		printArray(arr);    // ��ӡ ��ת����

			
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
