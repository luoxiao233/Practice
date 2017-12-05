package com.java.chario;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2_FileWriter {
	/*
	 * FileWriter类的write()方法可以自动把字符转为字节写出
		* //底层是将字符串转换成字符数组,读取到每一个字符的字节(gbk码表再将int型字节数字翻译成我们看得懂的文字)
	 */
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("xxx.txt");
		fw.write(97);
		fw.close();         //一定要记得关流
	}

}
