import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Test3 {
	/*
	 * ͨ��������������10�����������⣬����������Ϊ1��10֮������������������Ϊ��������ļӡ������ˡ������е�����һ�֣���������������
	 * ���ѧ���ش���ȷ������ʾ��good ! ��,������ʾ��Wrong !��
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
