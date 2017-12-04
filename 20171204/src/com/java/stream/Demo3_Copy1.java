package com.java.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_Copy1 {

	public static void main(String[] args) throws IOException {
//		demo1();
		FileInputStream fis = new FileInputStream("xxx.txt");
		FileOutputStream fos = new FileOutputStream("yyy.txt");
		
		int len;
		byte[] arr = new byte[2];
		while((len = fis.read(arr)) != -1){
			fos.write(arr,0,len);
		}
		fis.close();
		fos.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		byte[] arr= new byte[2];
		
		int a = fis.read(arr);
		System.out.println(a);
		
		for (byte b : arr) {
			System.out.println(b);
		}
		System.out.println("---------------");
		
		int c = fis.read(arr);
		System.out.println(c);
		for (byte b : arr) {
			System.out.println(b);
		}
	}

}
