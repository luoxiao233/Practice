package com.java.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo1_FileReader {
	/*
	 * FileReader类的read()方法可以按照字符大小读取
	 * 先读取到字节数据，再转化为字符，如果要写出字符，那么就要把字符转化为字符后再写出
	 * 
	 * 所以一般来说都不会使用
	 */
	public static void main(String[] args) throws IOException {
//		demo1();
		FileReader fr = new FileReader("xxx.txt");
		int c ;
		while((c = fr.read()) != -1){
			System.out.println((char)c);
		}
		fr.close();         //一定要记得关流
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("xxx.txt");
		
		int x = fr.read();
		char ch = (char)x;        //强制类型转换
		fr.close();
		System.out.println(x);
	}

}
