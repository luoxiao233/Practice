package com.java.otherclass;

public class Demo1_Math {

	public static void main(String[] args) {
		double d = 2.3;
		double d1 = 3.4;
		System.out.println(Math.abs(d));        //ȡ�þ���ֵ
		System.out.println(Math.ceil(d));       //����ȡ��
		System.out.println(Math.floor(d));      //����ȡ��
		System.out.println(Math.round(d));      //Ĭ�Ϸ��ص���Int
		
		System.out.println(Math.max(d, d1));    //ȡ���������е����ֵ   ͬ��ɵ���Сֵ
		
		System.out.println(Math.random());      //��������        0<=�����<1
		
		System.out.println(Math.pow(2,3));       //2Ϊ������3Ϊָ��     ��������Ĭ��Ϊdouble  ���Է���ֵҲ��double
		
		System.out.println(Math.sqrt(2.0));      //  ����������Ŀ�����    1.414...
		
		System.out.println(Math.round(3.3333));   // Math.round() ����   double����������
	}
}
