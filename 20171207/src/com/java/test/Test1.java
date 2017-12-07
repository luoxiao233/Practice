package com.java.test;

import java.io.File;
import java.util.Scanner;

public class Test1 {
/*
 * 需求:2,从键盘接收一个文件夹路径,删除该文件夹
 * 思路：
 * 1.首先先判断是否为一个文件夹路径（写作一个方法）
 * 2.将文件夹路径作为参数 创建一个删除方法，循环遍历（等于进入文件夹）
 * 3.遍历后如果是文件，就删除，如果不是，就选择->2->3->2   这样递归调用
 */
	public static void main(String[] args) {
		deleteDir(getDir());
	}
	public static File getDir(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入路径");
		while(true){
			File f = new File(sc.nextLine());
			if (!f.isDirectory()) {
				System.out.println("输的不对");
			}else {
				return f;
			}
		}
	}
	public static void deleteDir(File f){
		File[] subFiles = f.listFiles();
		for (File subFile : subFiles) {
			if (subFile.isFile()) {
				subFile.delete();
			}else{
				deleteDir(subFile);
			}
		}
		//删除空的文件夹
		f.delete();
	}
}
