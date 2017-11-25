package com.java.file;

import java.io.File;

public class Demo6_Test {
	/*
	 * 
	 * public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
	 * public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组 
	 */
	public static void main(String[] args) {
		File file = new File("D:\\");      //把这个列为一个对象
		File[] subFiles = file.listFiles();   //以文件夹中文件作为元素 创建一个文件数组
		for (File subFile : subFiles) {   // 循环这个数组
			if (subFile.isFile() && subFile.getName().endsWith(".txt")) {
				System.out.println(subFile);
			}
		}
	}

}
