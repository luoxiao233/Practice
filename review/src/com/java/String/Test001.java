package com.java.String;

public class Test001 {
/*
 * √∞≈›≈≈–Ú∫Õ—°‘Ò≈≈–Ú
 */
	public static void main(String[] args) {
//		demo1();
		demo2();
	}

	public static void demo2() {
		int[] arr = { 33, 55, 22, 66, 99, 11, 44 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1 + i; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i);
		}
	}

	public static void demo1() {
		int[] arr = { 33, 55, 22, 66, 99, 11, 44 };
		for (int i = 0; i < arr.length - 1 ; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
