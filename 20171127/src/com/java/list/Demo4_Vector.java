package com.java.list;

import java.util.Enumeration;
import java.util.Vector;

public class Demo4_Vector {
	/*
	 * * A:Vector�����
		* B:Vector�����й���
			* public void addElement(E obj)
			* public Enumeration elements()		//ö��
		* C:������ʾ	
			* Vector�ĵ���
	 */
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("a");
		v.addElement("b");
		v.addElement("c");
		v.addElement("d");
		
		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
