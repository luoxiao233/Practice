package com.java.method.b;

import static com.java.method.a.Operate.*;     //��̬������е�Operate���*(ȫ������)

public class StaticImportDemo {

	public static void main(String[] args) {
		System.out.println("4 + 4 =" + add(4,4));      //ֱ�ӵ��þ�̬����
		System.out.println("4 - 4 =" + sub(4,4));      //ֱ�ӵ��þ�̬����
		System.out.println("4 * 4 =" + mul(4,4));      //ֱ�ӵ��þ�̬����
		System.out.println("4 / 4 =" + div(4,4));      //ֱ�ӵ��þ�̬����
	}
}
