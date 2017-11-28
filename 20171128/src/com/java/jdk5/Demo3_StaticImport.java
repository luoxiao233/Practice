package com.java.jdk5;

import static java.util.Arrays.sort;
import static java.util.Arrays.toString;
public class Demo3_StaticImport extends Object{
	/*
	 * * A:静态导入概述
		* B:格式：
			* import static 包名….类名.方法名;
			* 可以直接导入到方法的级别
		* C:注意事项
			* 方法必须是静态的,如果有多个同名的静态方法，容易不知道使用谁?这个时候要使用，必须加前缀。由此可见，意义不大，所以一般不用，但是要能看懂。
			* jdk1.5版本的唯一败笔是:静态导入
	 */
	public static void main(String[] args){
		int[] arr = {22,44,33,55,11};
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
