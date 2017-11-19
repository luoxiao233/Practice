class Work_2{
	public static void main(String[] args) {
		//答：break用于Switch和循环中，作用为跳出循环
		//    continue用于循环中，作用为终止本次循环，执行下次循环
		//    return的作用是结束方法
		for (int i = 1;i <= 10 ;i++ ) {
			if (i == 4) {
				break;
			}
			System.out.println("haha了" + i + "次");
		}
		System.out.println("-------------");


		for (int i = 1;i <= 10 ;i++ ) {
			if (i == 4) {
				continue;
			}
			System.out.println("haha了" + i + "次");
		}
		System.out.println("-------------");


		for (int i = 1;i <= 10 ;i++ ) {
			if (i == 4) {
				return;//意为直接结束方法，若将此循环放在前两个前面，后面两个将不执行。
			}
			System.out.println("haha了" + i + "次");
		}
	}
}
