package com.java.map;

import java.util.ArrayList;
import java.util.Collections;

public class Demo5_Collections {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("f");
		
		Collections.shuffle(list);   //��ϴ     ͨ��˵����ϴ��
		System.out.println(list);
	}

}
