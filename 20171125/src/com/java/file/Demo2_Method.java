package com.java.file;

import java.io.File;
import java.io.IOException;

public class Demo2_Method {
/*
 * 文件的创建
 */
	public static void main(String[] args) throws IOException {
		File file1 = new File("xxx.txt");            //列出这个对象
		System.out.println(file1.createNewFile());   //判断这个对象是否被创建 如果已经被创建了显示false
		
		File dir = new File("aaa");
		System.out.println(dir.mkdir());       //同上，创建的是文件夹
		File dir1 = new File("bbb\\ccc");
		System.out.println(dir1.mkdirs());   //同上，创建的是多层文件夹
		File dir2 = new File("D:\\practice\\20171125\\eee.text");
		System.out.println(dir2.mkdir());     //判断这个绝对路径文件是否被创建
		
		
	}

}
