package com.java.regex;

public class Demo1_Regex {

	public static void main(String[] args) {
		/** 需求：校验qq号码.
		* 1:要求必须是5-15位数字
		* 2:0不能开头
		* 3:必须都是数字*/
		
		System.out.println(cheakQQ("123456"));
		String s= "[0-9]\\d{4,15}";    //第一位数为0-9之间，  \\d表示数字 ，｛4，14｝表示4<=数字个数<=14 
		System.out.println("123456".matches(s)); //用字符串.matches(正则)   验证是否匹配
		
	}
	public static boolean cheakQQ(String qq){
		boolean flag = true;
		if (qq.length() >= 5 && qq.length() < 15) {
			if (!qq.startsWith("0")) {
				char[] arr = qq.toCharArray();
				for (int i = 0; i < arr.length; i++) {
					char ch = arr[i];
					if (!(ch >= '0' && ch <= '9')) {
						flag = false;
						break;
					}
				}
			}else{
				flag = false;
			}
		}else{
			return flag;
		}
		return flag;
	}

}
