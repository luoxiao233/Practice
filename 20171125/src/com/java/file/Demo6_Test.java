package com.java.file;

import java.io.File;

public class Demo6_Test {
	/*
	 * 
	 * public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
	 * public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File���� 
	 */
	public static void main(String[] args) {
		File file = new File("D:\\");      //�������Ϊһ������
		File[] subFiles = file.listFiles();   //���ļ������ļ���ΪԪ�� ����һ���ļ�����
		for (File subFile : subFiles) {   // ѭ���������
			if (subFile.isFile() && subFile.getName().endsWith(".txt")) {
				System.out.println(subFile);
			}
		}
	}

}
