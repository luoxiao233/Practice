package com.java.test;

public class Demo1_Test {

	public static void main(String[] args) {
		/*
		 * * A:案例演示
			* 需求：把数组中的数据按照指定个格式拼接成一个字符串
			* 
					举例：
						int[] arr = {1,2,3};	
					输出结果：
						"[1, 2, 3]"
						
					用StringBuffer的功能实现
		 */
		int[] arr = {1,2,3,4};
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				sb.append(arr[i]);
				sb.append("]");
			}else{
				sb.append(arr[i]);
				sb.append(",");
			}
		}
		System.out.println(sb);
	}

}
