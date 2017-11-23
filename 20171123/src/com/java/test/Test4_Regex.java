package com.java.test;

import java.util.Arrays;

public class Test4_Regex {

	public static void main(String[] args) {
		String s = "97 27 46 38 50";
		String[] arr = s.split(" ");
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(arr2);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr2.length; i++) {
			if (i == arr2.length -1) {
				sb.append(arr[i]);
			}else {
				sb.append(arr[i]).append(" ");
			}
			
		}
		System.out.println(sb.toString());
	}

}
