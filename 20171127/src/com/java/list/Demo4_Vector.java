package com.java.list;

import java.util.Enumeration;
import java.util.Vector;

public class Demo4_Vector {
	/*
	 * * A:Vector类概述
		* B:Vector类特有功能
			* public void addElement(E obj)
			* public Enumeration elements()		//枚举
		* C:案例演示	
			* Vector的迭代
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
