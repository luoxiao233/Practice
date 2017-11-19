class MaoPao2{
	public static void main(String[] args) {
		MaoPao2 m = new MaoPao2();
		int[] arr = {2,4,1,6,3};
		m.paiXu1(arr);
		m.print(arr);
	}
	public static void paiXu1(int[] arr){
		for (int i = 0;i < arr.length - 1 ;i++ ) {
			for (int j = 1 + i;j < arr.length  ; j++) {
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
