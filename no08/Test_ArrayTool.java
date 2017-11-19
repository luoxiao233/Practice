class Test_ArrayTool{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		ArrayTool m = new ArrayTool();
		System.out.println(m.getMax(arr));
		m.print(arr);
		System.out.println();
		m.reverseArray(arr);
		m.print(arr);
	}
}
