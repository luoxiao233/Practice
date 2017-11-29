package com.java.set;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo4_TreeSet {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>(new CompareByLen());
		ts.add("aaaaaaa");
		ts.add("z");
		ts.add("wc");
		ts.add("nba");
		ts.add("cba");
		
		System.out.println(ts);
	}
}
class CompareByLen implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		int num = o1.length() - o2.length();
		return num == 0 ? o1.compareTo(o2) : num;
	}
}
