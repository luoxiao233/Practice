import java.util.Scanner;
class Print99{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个数");
		int x = sc.nextInt();
		for (int i = 1;i <= x ;i++ ) {
			for (int j = 1;j <= i ;j++ ) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}
}
