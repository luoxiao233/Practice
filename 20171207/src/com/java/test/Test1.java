package com.java.test;

import java.io.File;
import java.util.Scanner;

public class Test1 {
/*
 * ����:2,�Ӽ��̽���һ���ļ���·��,ɾ�����ļ���
 * ˼·��
 * 1.�������ж��Ƿ�Ϊһ���ļ���·����д��һ��������
 * 2.���ļ���·����Ϊ���� ����һ��ɾ��������ѭ�����������ڽ����ļ��У�
 * 3.������������ļ�����ɾ����������ǣ���ѡ��->2->3->2   �����ݹ����
 */
	public static void main(String[] args) {
		deleteDir(getDir());
	}
	public static File getDir(){
		Scanner sc = new Scanner(System.in);
		System.out.println("������·��");
		while(true){
			File f = new File(sc.nextLine());
			if (!f.isDirectory()) {
				System.out.println("��Ĳ���");
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
		//ɾ���յ��ļ���
		f.delete();
	}
}
