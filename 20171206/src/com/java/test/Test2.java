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
			System.out.println("你还有" + c-- + "此机会使用");
			BufferedWriter bw = new BufferedWriter(new FileWriter("config.txt"));
			bw.write(c + "");
			bw.close();
		}else if(c <= 0){
			System.out.println("不能用了");
		}
		br.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("config.txt"));
		String b = br.readLine();
		int c = Integer.parseInt(b);
		if (c > 0 ) {
			System.out.println("你还有"+ c-- + "次机会");
			FileWriter fw = new FileWriter("config.txt");
			fw.write(c + "");
			fw.close();
		}else{
			System.out.println("使用次数已经用光光了");
		}
		br.close();
	}

}
