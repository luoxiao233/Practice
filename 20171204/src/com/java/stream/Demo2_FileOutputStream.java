package com.java.stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2_FileOutputStream {
/*
 * write() 一次写出一个字符，内涵指针
 */
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("yyy.txt",true);  //最后的这个true     指的就是在原来的文件上进行修改
		fos.write(97);
		fos.close();
	}

}
