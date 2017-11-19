/**
这是一个数组工具类，本类中包含了三个方法：获得最大值，数组的遍历，数组的反转。
@version 1.0
@author  DKx
*/
public class ArrayTool{
	public int getMax(int[] arr){
		int max = arr[0];
		for (int i = 1;i < arr.length;i++ ) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	public void print(int[] arr){
		for (int i = 0;i < arr.length ;i++ ) {
			System.out.print(arr[i]+ " ");
		}
	}
	public void reverseArray(int[] arr){
		for (int i = 0;i < arr.length / 2 ;i ++ ) {
			arr[i] = arr[i] ^ arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = arr[i] ^ arr[arr.length - 1 - i];
			arr[i] = arr[i] ^ arr[arr.length - 1 - i];
		}
	}
}
