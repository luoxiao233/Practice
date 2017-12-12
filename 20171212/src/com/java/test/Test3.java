package com.java.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test3 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("yyy.properties"));
		Class clazz = Class.forName(br.readLine());
		DemoClass dc = (DemoClass) clazz.newInstance();
		dc.run();
		
	}

}
class DemoClass{
	public void run(){
		System.out.println("ฝ๘ศ๋มห");
	}
} 
