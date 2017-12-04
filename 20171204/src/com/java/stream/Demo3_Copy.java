package com.java.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_Copy {
	/*
	 * ����ͼƬ��4�ַ�����1.һ��һ����ȡ 2.һ����ȫ��ȡ 3.�ü���ȡһ���� 4.�û�����
	 * ������Ŷ�Ӧ����
		* FileInputStream��ȡ
		* FileOutputStreamд��
	 */
	public static void main(String[] args) throws IOException {
//		demo1();
//		demo2();
//		demo3();
//		demo4();
	}

	public static void demo4() throws FileNotFoundException, IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("����.png"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("�û������ó����ļ�.txt"));
		int b;
		while((b = bis.read()) != -1){
			bos.write(b);
		}
		bis.close();
		bos.close();
	}

	public static void demo3() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("����.png");
		FileOutputStream fos = new FileOutputStream("z�ü���ȡһ���ֵó���.txt");
		int len;
		byte[] arr = new byte[5];
		while((len = fis.read(arr)) != -1){
			fos.write(arr);
		}
		fis.close();
		fos.close();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("����.png");
		FileOutputStream fos = new FileOutputStream("��available�ó����ļ�.png");
		int i = fis.available();        //��i���գ� һ���Ե�ֱ��д�뵽�ڴ�  ���ٶȿ죬����д���ڴ棬������������� 
		fos.write(i);             //��i���ڴ���д��Ӳ��
		fis.close();
		fos.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("����.png");
		FileOutputStream fos = new FileOutputStream("�µ��ļ�.png");
		
		int b;
		while((b = fis.read()) != -1){
			fos.write(b);         //����һ��һ���ֽڵ�д�루�ٶ�����
		}
		fis.close();
		fos.close();          //�ر����������
	}

}
