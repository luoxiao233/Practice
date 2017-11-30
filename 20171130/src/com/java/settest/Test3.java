package com.java.settest;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test3 {
	/*
	 * 程序启动后, 可以从键盘输入接收多个整数, 直到输入quit时结束输入. 把所有输入的整数倒序排列打印.
	 * 分析:
	 * 1.键盘录入 Scanner对象
	 * 2.创建TreeSet集合,传入比较器
	 * 3.使用无限循环,当遇到字符串quit就终止循环;
	 * 4.如果是数字字符串,将其转换成int数存储到TreeSet集合中
	 * 5.遍历TreeSet集合,打印输出每一个元素
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入");
		
		
		
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				int num = o2 - o1;
				return num == 0 ? 1:num;
			}
		});
		while (true) {
			String line = sc.nextLine();
			if ("quit".equals(line)) {
				break;
			}else {
				try {
					int i = Integer.parseInt(line);
					ts.add(i);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					System.out.println("输入不对");
				}
			}
		}
		System.out.println(ts);
	}

}
