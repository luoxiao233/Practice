package com.java.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("����");
		
		FileOutputStream fos = new FileOutputStream("text.txt",true);    //�����������
		while(true){
			String s= sc.nextLine();
			if ("quit".equals(s)) {
				System.out.println("ͣ��");
				break;
			}else{
				fos.write(s.getBytes());
				fos.write("\r\n".getBytes());    //д�뻻����
			}
		}
		fos.close();
	}

}
