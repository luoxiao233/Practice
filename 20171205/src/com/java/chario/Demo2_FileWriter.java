package com.java.chario;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2_FileWriter {
	/*
	 * FileWriter���write()���������Զ����ַ�תΪ�ֽ�д��
		* //�ײ��ǽ��ַ���ת�����ַ�����,��ȡ��ÿһ���ַ����ֽ�(gbk����ٽ�int���ֽ����ַ�������ǿ��ö�������)
	 */
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("xxx.txt");
		fw.write(97);
		fw.close();         //һ��Ҫ�ǵù���
	}

}
