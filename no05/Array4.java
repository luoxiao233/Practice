import java.util.Scanner;
class Array4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����");
		int week = sc.nextInt();

		//char c = getWeek(week);
		System.out.println("����������" + getWeek(week));
	}
	public static char getWeek(int week){
		char[] arr = {' ','һ','��','��','��','��','��','��'};//ǰ���һ���ո��ַ���������һһ��Ӧ��
		return arr[week];
	}
}
