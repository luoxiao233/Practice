package com.java.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Demo4_LineNumberReader {
	/*
	 * * LineNumberReader是BufferedReader的子类, 具有相同的功能, 并且可以统计行号（从0开始）
			* 调用getLineNumber()方法可以获取当前行号
			* 调用setLineNumber()方法可以设置当前行号
	 */
	public static void main(String[] args) throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("xxx.txt"));
		String line;
		while((line = lnr.readLine()) != null) {
			System.out.println(lnr.getLineNumber() + ":" + line);
		}
		lnr.close();
	}

}
