package com.java.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Demo1_TransIO {
	/*
	 * *FileReader��ʹ��Ĭ������ȡ�ļ�, �����Ҫʹ��ָ������ȡ, ��ô����ʹ��InputStreamReader(�ֽ���,�����)
	  * FileWriter��ʹ��Ĭ�����д���ļ�, �����Ҫʹ��ָ�����д��, ��ô����ʹ��OutputStreamWriter(�ֽ���,�����)
	 */
	public static void main(String[] args) throws IOException, FileNotFoundException {
//		demo1();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("utf-8.txt"),"utf8"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("gbk.txt"),"gbk"));
		int c;
		while((c = br.read()) != -1){
			bw.write(c);
		}
		br.close();
		bw.close();
		
	}

	public static void demo1() throws UnsupportedEncodingException, FileNotFoundException, IOException {
		InputStreamReader is = new InputStreamReader(new FileInputStream("utf-8.txt"),"utf-8");
		OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream("gbk.txt"),"gbk");
		int c ;
		while((c = is.read()) != -1){
			os.write(c);
		}
		is.close();
		os.close();
	}

}
