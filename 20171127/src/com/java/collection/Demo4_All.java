package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo4_All {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		
		System.out.println(c1.addAll(c2));  //把c2中的每个元素加进c1
		System.out.println(c1);
		System.out.println(c1.add(c2)); //把c2当作一个元素加入c1
		System.out.println(c1);
	}

}
