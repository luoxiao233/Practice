package com.java.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1_FileInputStream {

	public static void main(String[] args) throws IOException {
//		demo1();
		FileInputStream fis = new FileInputStream("xxx.txt");
		int b;
		while((b = fis.read()) != -1){        //当fis.read()读出为-1的时候    就表是后面已经没有字符了
			System.out.println(b);     //默认指针的作用，可以直接打印出来后面的数 
		}
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		fis.read();                     //      自动读出第一个字符
		System.out.println(fis.read());           //读出第二个字符并且打印出来     read()方法中有默认指针向下一个
		fis.close();  					//关闭 流
	}

}
