package com.java.test;

import java.util.ArrayList;
import java.util.Collections;

public class test3 {

	public static void main(String[] args) {
		String[] color= {"方块","梅花","红桃","黑桃"};
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		ArrayList<String> poker = new ArrayList<>();
		for (String s1 : color) {
			for (String s2 : num) {
				poker.add(s1.concat(s2));
			}
		}
		poker.add("小王");
		poker.add("大王");
		
		
		Collections.shuffle(poker);
		ArrayList<String> n1 = new ArrayList<>();
		ArrayList<String> n2 = new ArrayList<>();
		ArrayList<String> n3 = new ArrayList<>();
		ArrayList<String> di = new ArrayList<>();
				
		
		for (int i = 0; i < poker.size(); i++) {
			if (i > 50) {
				di.add(poker.get(i));
			}else if (i % 3 == 0) {
				n1.add(poker.get(i));
			}else if (i % 3 == 1) {
				n2.add(poker.get(i));
			}else if (i % 3 == 2) {
				n3.add(poker.get(i));
			}
		}
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(di);
		
		
	}

}
