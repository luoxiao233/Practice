package com.java.buffer;

public class Demo4_Method {

	public static void main(String[] args) {
		/*
		 * StringBuffer的截取
		 */
		StringBuffer sb = new StringBuffer();
		sb.append("woxiangjingjing");
		
		String s = sb.substring(7);			//选取   索引值>=7   的字符
		System.out.println(s);				//得到jingjing
		
		String s2 = sb.substring(2,7);		//选取    2<=索引值<7   的字符
		System.out.println(s2);
	}

}
