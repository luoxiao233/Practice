package com.java.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2_Copy1 {

	public static void main(String[] args) throws IOException {
//		demo1();
		FileInputStream fis = new FileInputStream("xxx1.txt");
		FileOutputStream fos = new FileOutputStream("xxx2.txt");
		int b;
		while((b = fis.read()) != -1){
			fos.write(b ^ 123);
		}
		fis.close();
		fos.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		FileOutputStream fos = new FileOutputStream("xxx1.txt");
		
		int b;
		while((b = fis.read()) != -1){
			fos.write(b ^ 123);
		}
		fis.close();
		fos.close();
	}

}
