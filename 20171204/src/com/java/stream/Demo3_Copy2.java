package com.java.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_Copy2 {

	public static void main(String[] args) throws IOException {
//		demo1();
//		demo2();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("xxx.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("yyy.txt"));
		int b ;
		while((b = bis.read()) != -1){
			bos.write(b);
		}
		bis.close();
		bos.flush();   //主要是用来刷新
		bos.close();   //关流，释放资源。关流之前会刷新一次，然后再关闭
	}

	public static void demo2() throws FileNotFoundException, IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("xxx.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("yyy.txt"));
		
		int b;
		while((b = bis.read()) != -1){
			bos.write(b);
		}
		bis.close();
		bos.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		FileOutputStream fos = new FileOutputStream("yyy.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int b;
		while((b = bis.read()) != -1){
			bos.write(b);
		}
		
		bis.close();
		bos.close();
	}

}
