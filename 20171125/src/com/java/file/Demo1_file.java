package com.java.file;

import java.io.File;

public class Demo1_file {
/*
 * File��
 * ��Ϊ����·�������·��
 */
	public static void main(String[] args) {
//		demo1();
	}

static void demo1() {
	File parent = new File("F:\\�½��ļ���");
	String child = "Java�����������.pdf";
	File file = new File(parent,child);  //file�������ָ������ �и�child�ļ���parent�ļ���
	System.out.println(file.exists()); //�ļ�.exists() �ж�������ļ��Ƿ���ڣ�ǰ����������ļ��Ķ���
	System.out.println(parent.exists());
}

}
