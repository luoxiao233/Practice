package com.java.file;

import java.io.File;

public class Demo1_file {
/*
 * File类
 * 分为绝对路径和相对路径
 */
	public static void main(String[] args) {
//		demo1();
	}

static void demo1() {
	File parent = new File("F:\\新建文件夹");
	String child = "Java基础程序设计.pdf";
	File file = new File(parent,child);  //file这个对象指的现在 有个child文件在parent文件下
	System.out.println(file.exists()); //文件.exists() 判断这个个文件是否存在，前提是有这个文件的对象
	System.out.println(parent.exists());
}

}
