import java.util.Scanner;
class Array4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入");
		int week = sc.nextInt();

		//char c = getWeek(week);
		System.out.println("今天是星期" + getWeek(week));
	}
	public static char getWeek(int week){
		char[] arr = {' ','一','二','三','四','五','六','七'};//前面加一个空格字符，让日期一一对应；
		return arr[week];
	}
}
