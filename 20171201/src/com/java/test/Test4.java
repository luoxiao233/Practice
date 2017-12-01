package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Test4 {

	public static void main(String[] args) {
		String[] color= {"方块","梅花","红桃","黑桃"};
		String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		ArrayList<Integer> list = new ArrayList<>();
		int index = 0;
		HashMap<Integer, String> hm = new HashMap<>();
		
		for (String s1 : num) {
			for (String s2 : color) {
				hm.put(index, s2.concat(s1));        //往空白双列集合中 添加数据
				list.add(index);                     //目地是把list集合添加为 元素：为0-53的自然数
				index ++;
			}
		}
		System.out.println(index);     //测试用
		hm.put(index, "小王");
		System.out.println(hm.get(52));  //测试用
		list.add(index);
		index ++;
		hm.put(index, "大王");
		list.add(index);               //刚好添加  53 这个元素
//		System.out.println(list);
		
		Collections.shuffle(list);        //打乱这54 个元素
		
		TreeSet<Integer> n1 = new TreeSet<>();      //第一个人的牌 TreeSet是为了获得顺序
		TreeSet<Integer> n2 = new TreeSet<>();
		TreeSet<Integer> n3 = new TreeSet<>();
		TreeSet<Integer> di = new TreeSet<>();
		
		for (int i = 0; i <list.size(); i++) {
			if (i >= list.size() - 3) {
				di.add(list.get(i));
			}else if (i % 3 == 0) {
				n1.add(list.get(i));
			}else if (i % 3 == 1) {
				n2.add(list.get(i));
			}else {
				n3.add(list.get(i));
			}
		}
		
		
		lookPoker("n1",n1,hm);
		lookPoker("n2",n2,hm);
		lookPoker("n3",n3,hm);
		lookPoker("di",di,hm);
	}

	public static void lookPoker(String name,TreeSet<Integer> ts,HashMap<Integer, String> hm) {
		System.out.print(name + "的是:");
		for(Integer i : ts) {
			System.out.print(hm.get(i) + " ");
		}
		System.out.println();
	}

}
