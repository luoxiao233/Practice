package com.java.stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2_FileOutputStream {
/*
 * write() һ��д��һ���ַ����ں�ָ��
 */
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("yyy.txt",true);  //�������true     ָ�ľ�����ԭ�����ļ��Ͻ����޸�
		fos.write(97);
		fos.close();
	}

}
