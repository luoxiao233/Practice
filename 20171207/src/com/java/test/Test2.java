package com.java.test;

import java.io.File;
import java.util.Scanner;

public class Test2 {
/*
 * ����:4,�Ӽ��̽���һ���ļ���·��,���ļ����е������ļ��Լ��ļ��е����ְ��㼶��ӡ
 * �ص㣺ÿ��һ�����ļ���ǰ�涼Ҫ��һ��\t ��ʾΪ��һ��
 */
	public static void main(String[] args) {
		printDir(getDir(),0);
	}
	public static void printDir(File dir,int lev){
		File[] subFiles = dir.listFiles();
		for (File subFile : subFiles) {
			for (int i = 0; i <= lev; i++) {
				System.out.print("\t");           //��ѭ���� ����\tѭ��
			}
			System.out.println(subFile.getName());
			if (subFile.isDirectory()) {
				printDir(subFile,lev + 1);
			}
		}
	}
	
	
	
	public static File getDir(){
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ��·��");
		while(true){
			File dir = new File(sc.nextLine());
			if (!dir.exists()) {
				System.out.println("�����ڵ�");
			}else if(dir.isFile()){
				System.out.println("���Ǹ��ļ�");
			}else{
				return dir;
			}
		}
	}

}
