package com.java.file;

import java.io.File;
import java.io.IOException;

public class Demo2_Method {
/*
 * �ļ��Ĵ���
 */
	public static void main(String[] args) throws IOException {
		File file1 = new File("xxx.txt");            //�г��������
		System.out.println(file1.createNewFile());   //�ж���������Ƿ񱻴��� ����Ѿ�����������ʾfalse
		
		File dir = new File("aaa");
		System.out.println(dir.mkdir());       //ͬ�ϣ����������ļ���
		File dir1 = new File("bbb\\ccc");
		System.out.println(dir1.mkdirs());   //ͬ�ϣ��������Ƕ���ļ���
		File dir2 = new File("D:\\practice\\20171125\\eee.text");
		System.out.println(dir2.mkdir());     //�ж��������·���ļ��Ƿ񱻴���
		
		
	}

}
