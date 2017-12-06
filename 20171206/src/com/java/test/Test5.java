package com.java.test;

import java.io.File;

public class Test5 {
/*
 * 统计一个文件的大小
 */
	public static void main(String[] args) {
		File dir = Test4.getDir();
		System.out.println(getLength(dir));
	}
	public static long getLength(File dir){
		long len = 0;
		File[] subFiles = dir.listFiles();
		for (File subFile : subFiles) {
			if (subFile.isFile()) {
				len += subFile.length();
			}else{
				len += getLength(subFile);
			}
		}
		return len;
	}

}
