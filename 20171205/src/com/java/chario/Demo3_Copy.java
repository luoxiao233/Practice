package com.java.chario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3_Copy {

	public static void main(String[] args) throws IOException {
//		demo1();
//		demo2();
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("uuu.txt"));
		
		String line;
		while((line = br.readLine()) != null){
			bw.write(line);
//			bw.write("\r\n");     只能在Windows系统中使用
			bw.newLine();    //优点，跨平台，各个系统都可以使用
		}
		br.close();
		bw.close();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("ooo.jpg");
		FileWriter fw = new FileWriter("aaa.jpg");      // 如果强行用字符流读取输出其他文件，那么很容易丢失，导致打不开
		
		int c;
		while((c = fr.read()) != -1){
			fw.write(c);
		}
		fr.close();
		fw.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("ooo.txt");
		FileWriter fw = new FileWriter("aaa.txt");
		
		int c;
		while((c = fr.read()) != -1){
			fw.write(c);
		}
		fr.close();
		fw.close();
	}

}
