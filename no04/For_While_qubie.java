class For_While_qubie{
	public static void main(String[] args) {
		//区别：连个循环体中，While的变量循环后依旧可以使用，而For循环后的变量是不可以使用的。
		int i = 11;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("i = " + i);
		System.out.println("--------------");
		for (int j = 11;j <= 10 ;j++ ) {
			System.out.println(j);
		}
		System.out.println("j = " + j);//此行会提示找不到J 这个符号，就是因为在For循环后变量消失。
	}
}
