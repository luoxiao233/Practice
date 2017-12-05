package com.java.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo1_FileReader {
	/*
	 * FileReader���read()�������԰����ַ���С��ȡ
	 * �ȶ�ȡ���ֽ����ݣ���ת��Ϊ�ַ������Ҫд���ַ�����ô��Ҫ���ַ�ת��Ϊ�ַ�����д��
	 * 
	 * ����һ����˵������ʹ��
	 */
	public static void main(String[] args) throws IOException {
//		demo1();
		FileReader fr = new FileReader("xxx.txt");
		int c ;
		while((c = fr.read()) != -1){
			System.out.println((char)c);
		}
		fr.close();         //һ��Ҫ�ǵù���
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("xxx.txt");
		
		int x = fr.read();
		char ch = (char)x;        //ǿ������ת��
		fr.close();
		System.out.println(x);
	}

}
