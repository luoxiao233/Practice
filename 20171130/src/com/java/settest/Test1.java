package com.java.settest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Test1 {
	/*
	 *  在一个集合中存储了无序并且重复的字符串,定义一个方法,让其有序(字典顺序),而且还不能去除重复
	 *  分析:
	 *  1.在集合中存储无序且重复的字符串,定义一个List集合
	 *  2.定义一个方法,进行排序并且保留重复
	 *  3.打印输出List
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("bbb");
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("rrrrrr");
		list.add("wer");
		
		sort(list);
		System.out.println(list);
	}

	public static void sort(List<String> list) {
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int num = o1.compareTo(o2);
				return num == 0 ? 1 : num;
			}
			
		});
		ts.addAll(list);
		list.clear();
		list.addAll(ts);
	}

}
