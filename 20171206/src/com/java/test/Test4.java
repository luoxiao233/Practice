package com.java.test;

import java.io.File;
import java.util.Scanner;

public class Test4 {
/*
 * Ҫ������һ��·������ӡ��·�������е�Java�ļ�
 */
	public static void main(String[] args) {
		print1(getDir1());
	}
	public static void print1(File f){
		File[] fs = f.listFiles();     //��������ļ��У��õ��ļ�����
		for (File file : fs) {         //�����������
			if (file.isFile() && file.getName().endsWith(".java")) {
				System.out.println(file);
			}else if(file.isDirectory()){
				print1(file);
			}
		}
	}
	public static File getDir1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("������·��");
		while(true){
			File f = new File(sc.nextLine());
			if (!f.isDirectory()) {
				System.out.println("����һ���ļ���");
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
		System.out.println("����һ��·��");
		while(true){
			String line = sc.nextLine();
			File dir = new File(line);
			if (!dir.exists()) {
				System.out.println("������ļ���·��������");
			}else if(dir.isFile()){
				System.out.println("���������һ���ļ�·��");
			}else{
				return dir;
			}
		}
	} 
}
