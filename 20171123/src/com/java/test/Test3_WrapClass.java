package com.java.test;

public class Test3_WrapClass {

	public static void main(String[] args) {
		Integer i1 = new Integer(97);
		Integer i2 = new Integer(97);
		System.out.println(i1 == i2);            // �������������������ֵַ��һ��
		System.out.println(i1.equals(i2));		//true
		System.out.println("-----------");
	
		Integer i3 = new Integer(197);
		Integer i4 = new Integer(197);
		System.out.println(i3 == i4);         //ͬ��
		System.out.println(i3.equals(i4));    //true
		System.out.println("-----------");
	
		Integer i5 = 97;		//�Զ�װ��      97��int�ͣ�ֱ�ӱ����Integer   1.5�汾������
		Integer i6 = 97;        // �൱��һ������
		System.out.println(i5 == i6);
		System.out.println(i5.equals(i6));		//true
		System.out.println("-----------");
	
		Integer i7 = 197;		//new Inter(197)  ����-128��127��byte��ȡֵ��Χ �ͻᴴ��
		Integer i8 = 197;		//new Inter(197)
		System.out.println(i7 == i8);
		System.out.println(i7.equals(i8));
		
		/*
		 * -128��127��byte��ȡֵ��Χ,��������ȡֵ��Χ��,�Զ�װ��Ͳ����´�������,���Ǵӳ������л�ȡ
		 * ���������byteȡֵ��Χ�ͻ����´�������
		 * 
		 * public static Integer valueOf(int i) {
		        if (i >= IntegerCache.low && i <= IntegerCache.high)			//i>= -128 && i <= 127
		            return IntegerCache.cache[i + (-IntegerCache.low)];
					else 
		        return new Integer(i);
		    }
		 */
	}

}
