import java.util.Scanner;
class Work4_1{
	public static void main(String[] args) {
		//������(���ݼ���¼������,���Ҷ�Ӧ����)
		//����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)

		Scanner sc = new Scanner(System.in);
		System.out.println("����");
		int a = sc.nextInt();
		char[] arr = {' ','һ','��','��','��','��','��','��'};
		System.out.println("��������" + arr[a]);
		char b = '��';
		for (int i = 0;i < arr.length ;i++ ) {
			if (b == arr[i]) {
				System.out.println(i);
			}
		}
	}
}
