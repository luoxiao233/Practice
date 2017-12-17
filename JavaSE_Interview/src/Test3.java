import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Test3 {
	/*
	 * 通过计算机随机产生10道四则运算题，两个操作数为1—10之间的随机数，运算类型为随机产生的加、减、乘、整除中的任意一种，不给机会重做，
	 * 如果学生回答正确，则显示“good ! ”,否则显示“Wrong !”
	 */
	public static void main(String[] args) {
		int i = 1;
		while(i < 11){
			Scanner sc = new Scanner(System.in);
			char[] c ={'+','-','*','/'};
			Random random = new Random();
			Random r = new Random();
			int index=random.nextInt(c.length);
			char resultChar=c[index];
			int t1 = r.nextInt(10)+1;
			int t2 = r.nextInt(10)+1;
			DecimalFormat df1 = new DecimalFormat("###.00");
			if (resultChar == '+') {
				int x = t1 + t2;
				System.out.println(t1 + " + " + t2 + " = ?");
				int an = sc.nextInt();
				if(an != x){
					System.out.println("wrong");
				}
			}else if(resultChar == '-'){
				int x = t1 - t2;
				System.out.println(t1 + " - " + t2+ " = ?");
				int an = sc.nextInt();
				if(an != x){
					System.out.println("wrong");
				}
			}else if(resultChar == '*'){
				int x = t1 * t2;
				System.out.println( t1 + " * " + t2+ " = ?");
				int an = sc.nextInt();
				if(an != x){
					System.out.println("wrong");
				}
			}else{
				double x = (double)(t1 / t2);
				System.out.println(t1 + " / " + t2+ " = ?");
				double an1 = sc.nextDouble();
				String an = df1.format(an1);
				if(!an.equals(an)){
					System.out.println("wrong");
				}
			}
			i++;
		}
	}
}
