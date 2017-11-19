class Array5{
	public static void main(String[] args) {
		int[] arr = {2,6,4,9,4,2,4,5};
		int index = getIndex(arr,2);
		System.out.println(index);
		
	}
	public static int getIndex(int[] arr,int a){
		for (int i = 0;i < arr.length ;i++ ) {
			if (arr[i] == a) {
				return i;
			}
		}
		return -1;
	}
	
}
