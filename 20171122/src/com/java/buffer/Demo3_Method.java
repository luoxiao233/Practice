package com.java.buffer;

public class Demo3_Method {

	public static void main(String[] args) {
		/*
		 * StringBuffer的删除和替换
		 */
		StringBuffer sb = new StringBuffer();
		sb.append("zheshizhendejiada");
		System.out.println(sb);
		sb.deleteCharAt(0);     //删除0处索引的字符
		System.out.println(sb);
		sb.delete(0, 2);    // 删除从0，1 处索引的字符
		System.out.println(sb);
		sb.replace(0, 3, "wo");  //用wo 替代 0，1，2索引处的字符
		System.out.println(sb);
		System.out.println(sb.reverse());   //反转这个字符串  （String中没有这个功能）
	}

}
