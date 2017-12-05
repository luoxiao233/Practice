package com.java.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class test {
	/*
	 * 在控制台输入文件路径，将文件拷贝到当前目录下
	 * 分析：
	 * 1.创建键盘录入对象，将输入的路径名封装为一个file对象，如果是file对象，那就对file对象进行判断，如果是文件路径就返回。
	 * 2.调用方法得到路径名，得到文件的路径的file对象
	 * 3.创建输入输入流的对象进行读写复制
	 */
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(getFile()));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(getFile().getName()));
		int b;
		while((b = bis.read()) != -1){
			bos.write(b);
		}
		bis.close();
		bos.close();
	}
	public static File getFile(){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个文件路径");
		
		while(true){
			File fi = new File(sc.nextLine());
			if (!fi.exists()) {
				System.out.println("文件不存在");
			}else if(fi.isDirectory()){
				System.out.println("这是文件夹路径");
			}else {
				return fi;
			}
		}
	}
}
