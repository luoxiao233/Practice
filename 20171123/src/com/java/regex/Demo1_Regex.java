package com.java.regex;

public class Demo1_Regex {

	public static void main(String[] args) {
		/** ����У��qq����.
		* 1:Ҫ�������5-15λ����
		* 2:0���ܿ�ͷ
		* 3:���붼������*/
		
		System.out.println(cheakQQ("123456"));
		String s= "[0-9]\\d{4,15}";    //��һλ��Ϊ0-9֮�䣬  \\d��ʾ���� ����4��14����ʾ4<=���ָ���<=14 
		System.out.println("123456".matches(s)); //���ַ���.matches(����)   ��֤�Ƿ�ƥ��
		
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
