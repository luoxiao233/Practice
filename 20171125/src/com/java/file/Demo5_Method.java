package com.java.file;

import java.io.File;

public class Demo5_Method {
	/*
	 * * A:获取功能
			* public String getAbsolutePath()：获取绝对路径
			* public String getPath():获取路径(构造方法中传入的路径)
			* public String getName():获取名称
			* public long length():获取长度。字节数
			* public long lastModified():获取最后一次的修改时间，毫秒值
			* public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
			* public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组 
		* B:案例演示
			* File类的获取功能
	 */
	public static void main(String[] args) {
		File file = new File("xxx.txt");
		String s1 = file.getAbsolutePath();    //获得绝对路径
		System.out.println(s1);             //打印出来
		System.out.println(file.getPath());       //直接打印路径
	}

}
