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
	 * �ڿ���̨�����ļ�·�������ļ���������ǰĿ¼��
	 * ������
	 * 1.��������¼����󣬽������·������װΪһ��file���������file�����ǾͶ�file��������жϣ�������ļ�·���ͷ��ء�
	 * 2.���÷����õ�·�������õ��ļ���·����file����
	 * 3.���������������Ķ�����ж�д����
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
		System.out.println("����һ���ļ�·��");
		
		while(true){
			File fi = new File(sc.nextLine());
			if (!fi.exists()) {
				System.out.println("�ļ�������");
			}else if(fi.isDirectory()){
				System.out.println("�����ļ���·��");
			}else {
				return fi;
			}
		}
	}
}
