package com.java.settest;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test2 {
	/*
	 * 从键盘接收一个字符串, 程序对其中所有字符进行排序,例如键盘输入: helloitcast程序打印:acehillostt
	 * 分析:
	 * 1.键盘接收Scanner
	 * 2.进行排序,并保留重复:创建TreeSet集合,在构造方法中传入比较器,重写compare方法,让返回值是非0即可
	 * 3.将接收的字符串转换成字符数组
	 * 4.遍历字符数组,把数组中的每一个元素添加Set集合,
	 * 5.遍历Set集合,把里面排好序且保留重复的元素输出
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入");
		TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {
				int num = o1.compareTo(o2);
				return num == 0 ? 1 : num;
			}
		});
		String line = sc.nextLine();
		char[] arr = line.toCharArray();
		for (char c : arr) {
			ts.add(c);
		}
		for (Character c : ts) {
			System.out.print(c);
		}
	}

}
