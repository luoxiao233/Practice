package com.java.file;

import java.io.File;

public class Demo3_Method {

	public static void main(String[] args) {
		File file = new File("xxx.txt");
		File file2 = new File("yyy.txt");
		System.out.print(file.renameTo(file2)); // ������  �򵥵�˵�����õڶ����ļ������ǵ�һ���������ǵ�һ���ļ�������ڣ�
//		File file3 = new File("ccc");
//		System.out.println(file3.delete());    �����������ɾ���ļ�������ļ�Ҳ�Ǳ������
	}

}
