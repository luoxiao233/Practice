package com.java.test;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		String str = "aaaaaaabbbbbbbbbvcvccc";
		char[] arr = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		for(char c : arr){
			if(!hm.containsKey(c)){
				hm.put(c, 1);
			}else{
				hm.put(c, hm.get(c) + 1);
			}
		}
		/*for(char c : arr){
			hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c) + 1);
		}*/                       //这个和上面的一样
		
		
		System.out.println(hm);   //得到{a=7, b=9, c=4, v=2}
		
		for(Character c :hm.keySet() ){
			System.out.println(c + "=" + hm.get(c));
					/*   得到
					 *  a=7
						b=9
						c=4
						v=2
					*/
		}
		
	}

}
