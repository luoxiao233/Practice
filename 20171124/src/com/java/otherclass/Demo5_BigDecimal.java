package com.java.otherclass;

import java.math.BigDecimal;

public class Demo5_BigDecimal {

	public static void main(String[] args) {
		/*
		 * BigDecimal �ô�����Ϊfloat �� double���׶�ʧ���ȣ�����ת��ΪBigDecimal
		 */
		
		double d = 2.0;
		double d1 = 1.1;
		System.out.println(d-d1);//0.8999999999999999  ��ʧ����
		
		BigDecimal bd = new BigDecimal(d);
		BigDecimal bd1 = new BigDecimal(d1);
		System.out.println(bd.subtract(bd1));
	}

}
