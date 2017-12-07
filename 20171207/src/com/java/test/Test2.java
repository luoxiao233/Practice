package com.java.test;

import java.io.File;
import java.util.Scanner;

public class Test2 {
/*
 * 需求:4,从键盘接收一个文件夹路径,把文件夹中的所有文件以及文件夹的名字按层级打印
 * 重点：每下一级的文件夹前面都要加一个\t 表示为下一级
 */
	public static void main(String[] args) {
		printDir(getDir(),0);
	}
	public static void printDir(File dir,int lev){
		File[] subFiles = dir.listFiles();
		for (File subFile : subFiles) {
			for (int i = 0; i <= lev; i++) {
				System.out.print("\t");           //在循环中 插入\t循环
			}
			System.out.println(subFile.getName());
			if (subFile.isDirectory()) {
				printDir(subFile,lev + 1);
			}
		}
	}
	
	
	
	public static File getDir(){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个路径");
		while(true){
			File dir = new File(sc.nextLine());
			if (!dir.exists()) {
				System.out.println("不存在的");
			}else if(dir.isFile()){
				System.out.println("它是个文件");
			}else{
				return dir;
			}
		}
	}

}
