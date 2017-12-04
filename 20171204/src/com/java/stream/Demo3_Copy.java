package com.java.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_Copy {
	/*
	 * 拷贝图片（4种方法）1.一个一个的取 2.一次性全部取 3.用集合取一部分 4.用缓冲区
	 * 各个编号对应方法
		* FileInputStream读取
		* FileOutputStream写出
	 */
	public static void main(String[] args) throws IOException {
//		demo1();
//		demo2();
//		demo3();
//		demo4();
	}

	public static void demo4() throws FileNotFoundException, IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("试用.png"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("用缓冲区得出的文件.txt"));
		int b;
		while((b = bis.read()) != -1){
			bos.write(b);
		}
		bis.close();
		bos.close();
	}

	public static void demo3() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("试用.png");
		FileOutputStream fos = new FileOutputStream("z用集合取一部分得出的.txt");
		int len;
		byte[] arr = new byte[5];
		while((len = fis.read(arr)) != -1){
			fos.write(arr);
		}
		fis.close();
		fos.close();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("试用.png");
		FileOutputStream fos = new FileOutputStream("用available得出的文件.png");
		int i = fis.available();        //用i接收： 一次性的直接写入到内存  （速度快，但是写入内存，数据容易溢出） 
		fos.write(i);             //把i从内存中写入硬盘
		fis.close();
		fos.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("试用.png");
		FileOutputStream fos = new FileOutputStream("新的文件.png");
		
		int b;
		while((b = fis.read()) != -1){
			fos.write(b);         //这是一个一个字节的写入（速度慢）
		}
		fis.close();
		fos.close();          //关闭输入输出流
	}

}
