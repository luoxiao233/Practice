class Work_2{
	public static void main(String[] args) {
		//��break����Switch��ѭ���У�����Ϊ����ѭ��
		//    continue����ѭ���У�����Ϊ��ֹ����ѭ����ִ���´�ѭ��
		//    return�������ǽ�������
		for (int i = 1;i <= 10 ;i++ ) {
			if (i == 4) {
				break;
			}
			System.out.println("haha��" + i + "��");
		}
		System.out.println("-------------");


		for (int i = 1;i <= 10 ;i++ ) {
			if (i == 4) {
				continue;
			}
			System.out.println("haha��" + i + "��");
		}
		System.out.println("-------------");


		for (int i = 1;i <= 10 ;i++ ) {
			if (i == 4) {
				return;//��Ϊֱ�ӽ���������������ѭ������ǰ����ǰ�棬������������ִ�С�
			}
			System.out.println("haha��" + i + "��");
		}
	}
}
