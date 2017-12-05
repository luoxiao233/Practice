package com.java.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Demo4_LineNumberReader {
	/*
	 * * LineNumberReader��BufferedReader������, ������ͬ�Ĺ���, ���ҿ���ͳ���кţ���0��ʼ��
			* ����getLineNumber()�������Ի�ȡ��ǰ�к�
			* ����setLineNumber()�����������õ�ǰ�к�
	 */
	public static void main(String[] args) throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("xxx.txt"));
		String line;
		while((line = lnr.readLine()) != null) {
			System.out.println(lnr.getLineNumber() + ":" + line);
		}
		lnr.close();
	}

}
