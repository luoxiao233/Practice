package com.java.file;

import java.io.File;

public class Demo5_Method {
	/*
	 * * A:��ȡ����
			* public String getAbsolutePath()����ȡ����·��
			* public String getPath():��ȡ·��(���췽���д����·��)
			* public String getName():��ȡ����
			* public long length():��ȡ���ȡ��ֽ���
			* public long lastModified():��ȡ���һ�ε��޸�ʱ�䣬����ֵ
			* public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
			* public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File���� 
		* B:������ʾ
			* File��Ļ�ȡ����
	 */
	public static void main(String[] args) {
		File file = new File("xxx.txt");
		String s1 = file.getAbsolutePath();    //��þ���·��
		System.out.println(s1);             //��ӡ����
		System.out.println(file.getPath());       //ֱ�Ӵ�ӡ·��
	}

}
