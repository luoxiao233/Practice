package com.java.test;

public class Test8 {
/*
 * 求1000！  后面有多少个零
 * 分析：
 * 把1000这个个数分解质因数        那么至少有1000个质因数
 * 5的倍数会产生零  特点：质因数中含有1个5会产生1个0  含有2个5能产生2个0  含有3个能产生3个0  含有4个能产生4个0
 * 那么因数中含0个5会产生0个0
 */
	public static void main(String[] args) {
		System.out.println(fun(1000));
	}
	public static int fun(int num){
		if(num >= 0 && num <= 4){
			return 0;
		}else{
			return num/5 + fun(num/5);
		}
	}
}
