package com.java.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1_FileInputStream {

	public static void main(String[] args) throws IOException {
//		demo1();
		FileInputStream fis = new FileInputStream("xxx.txt");
		int b;
		while((b = fis.read()) != -1){        //��fis.read()����Ϊ-1��ʱ��    �ͱ��Ǻ����Ѿ�û���ַ���
			System.out.println(b);     //Ĭ��ָ������ã�����ֱ�Ӵ�ӡ����������� 
		}
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		fis.read();                     //      �Զ�������һ���ַ�
		System.out.println(fis.read());           //�����ڶ����ַ����Ҵ�ӡ����     read()��������Ĭ��ָ������һ��
		fis.close();  					//�ر� ��
	}

}
