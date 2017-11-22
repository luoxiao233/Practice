package com.java.buffer;

public class Demo2_Method {

	public static void main(String[] args) {
		/*
		 * StringBuffer的重要理解
		 */
//		demo1();
		StringBuffer sb = new StringBuffer();
		System.out.println(sb);    				// 返回显示为空
		StringBuffer sb1 = sb.append("hehe");
		System.out.println(sb1);				//hehe
		StringBuffer sb2 = sb.append(true);
		System.out.println(sb2);				//hehetrue
		StringBuffer sb3 = sb.append(100);
		System.out.println(sb3);				//hehetrue100
		
		System.out.println(sb); //heheture100
		System.out.println(sb1);//heheture100
		System.out.println(sb2);//heheture100
		System.out.println(sb3);//heheture100 
		//原因是缓冲区只有一个，可以接收过程化，但是最终的结果是只有一个的
	}

	static void demo1() {
		StringBuffer b = new StringBuffer();     //创建一个缓冲区
		StringBuffer b1 = b.append("woshizuile");  //里面加入字符
		b.insert(5, "zhende");  // 在序列5之前插入此序列
		System.out.println(b);   //显示出缓冲区
	}

}
