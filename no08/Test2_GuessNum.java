import java.util.Scanner;
class Test2_GuessNum{
	public static void main(String[] args) {
		int myNum = (int)(Math.random() * 100) + 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("猜对算我输");
		
		
		while (true) {
			int s = sc.nextInt();
			if (s > myNum) {
				System.out.println("大了");
			}else if (s < myNum) {
				System.out.println("小了");
			}else {
				System.out.println("对了");
				break;
			}
		}
	}
}
