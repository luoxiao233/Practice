package com.java.string;

public class Test6_String {

	public static void main(String[] args) {
		String max = "woshizhendezuile,wojiangdedoushizhenhua";
		String min = "zhen";
		int count = 0;
		int index = 0;
		while((index = max.indexOf(min)) != -1){
			count++;
			max = max.substring(index + min.length());
		}
		System.out.println(count);
	}
}
