package com.java.test;

import java.io.File;
import java.util.Scanner;

public class Test4 {
/*
 * 要求：输入一个路径，打印出路径中所有的Java文件
 */
	public static void main(String[] args) {
		print1(getDir1());
	}
	public static void print1(File f){
		File[] fs = f.listFiles();     //进入这个文件夹，得到文件数组
		for (File file : fs) {         //遍历数组操作
			if (file.isFile() && file.getName().endsWith(".java")) {
				System.out.println(file);
			}else if(file.isDirectory()){
				print1(file);
			}
		}
	}
	public static File getDir1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入路径");
		while(true){
			File f = new File(sc.nextLine());
			if (!f.isDirectory()) {
				System.out.println("不是一个文件夹");
			}else{
				return f;
			}
		}
	}
	

	public static void print(File dir){
		File[] subFiles = dir.listFiles();
		for (File subFile : subFiles) {
			if (subFile.isFile() && subFile.getName().endsWith(".java")) {
				System.out.println(subFile.getName());
			}else if(subFile.isDirectory()){
				print(subFile);
			}
		}
	}
	public static File getDir(){
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个路径");
		while(true){
			String line = sc.nextLine();
			File dir = new File(line);
			if (!dir.exists()) {
				System.out.println("输入的文件夹路径不存在");
			}else if(dir.isFile()){
				System.out.println("你输入的是一个文件路径");
			}else{
				return dir;
			}
		}
	} 
}
