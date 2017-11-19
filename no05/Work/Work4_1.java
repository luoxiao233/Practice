import java.util.Scanner;
class Work4_1{
	public static void main(String[] args) {
		//数组查表法(根据键盘录入索引,查找对应星期)
		//数组元素查找(查找指定元素第一次在数组中出现的索引)

		Scanner sc = new Scanner(System.in);
		System.out.println("输入");
		int a = sc.nextInt();
		char[] arr = {' ','一','二','三','四','五','六','七'};
		System.out.println("这是星期" + arr[a]);
		char b = '二';
		for (int i = 0;i < arr.length ;i++ ) {
			if (b == arr[i]) {
				System.out.println(i);
			}
		}
	}
}
