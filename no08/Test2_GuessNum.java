import java.util.Scanner;
class Test2_GuessNum{
	public static void main(String[] args) {
		int myNum = (int)(Math.random() * 100) + 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("�¶�������");
		
		
		while (true) {
			int s = sc.nextInt();
			if (s > myNum) {
				System.out.println("����");
			}else if (s < myNum) {
				System.out.println("С��");
			}else {
				System.out.println("����");
				break;
			}
		}
	}
}
