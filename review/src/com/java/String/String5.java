package com.java.String;

public class String5 {
/*
 * 	/*
	 * * A:案例演示
			* 需求:把字符串反转
				* 举例:键盘录入"abc"
				* 输出结果"cba"
				* 
 */
	public static void main(String[] args) {
		String s = "abc";
		StringBuilder sb = new StringBuilder(s);
		
		/*这种互相调换的reverse方法存在于StringBuiler、StringBuffer、Collections（反转元素顺序）
		 * 
		* StringBuffer和StringBuilder的区别
		* StringBuffer是1.0线程安全的，效率慢
		* StringBuilder是1.5线程不安全的，效率块
		*/
		sb.reverse();
		System.out.println(sb);
	}

}
