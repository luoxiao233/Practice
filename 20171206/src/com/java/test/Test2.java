package com.java.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws IOException {
//		demo1();
		
		BufferedReader br = new BufferedReader(new FileReader("config.txt"));
		String b = br.readLine();
		int c = Integer.parseInt(b);
		System.out.println(c);       
		if (c > 0) {
			System.out.println("�㻹��" + c-- + "�˻���ʹ��");
			BufferedWriter bw = new BufferedWriter(new FileWriter("config.txt"));
			bw.write(c + "");
			bw.close();
		}else if(c <= 0){
			System.out.println("��������");
		}
		br.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("config.txt"));
		String b = br.readLine();
		int c = Integer.parseInt(b);
		if (c > 0 ) {
			System.out.println("�㻹��"+ c-- + "�λ���");
			FileWriter fw = new FileWriter("config.txt");
			fw.write(c + "");
			fw.close();
		}else{
			System.out.println("ʹ�ô����Ѿ��ù����");
		}
		br.close();
	}

}
