package com.java.string;

public class Test2_String {

	public static void main(String[] args) {
		int spper = 0;
		int lower = 0;
		int num = 0;
		int others = 0;
		String s = "gwoNGFOW1234$%&@";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				spper++;
			}else if(c >= 'a' && c <= 'z'){
				lower++;
			}else if(c >= '0' && c <= '9'){
				num++;
			}else{
				others ++;
			}
		}
		System.out.print(spper + lower + num + others);
	}

}
