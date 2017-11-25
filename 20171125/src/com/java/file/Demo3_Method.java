package com.java.file;

import java.io.File;

public class Demo3_Method {

	public static void main(String[] args) {
		File file = new File("xxx.txt");
		File file2 = new File("yyy.txt");
		System.out.print(file.renameTo(file2)); // 重命名  简单的说就是用第二个文件名覆盖第一个，（但是第一个文件必须存在）
//		File file3 = new File("ccc");
//		System.out.println(file3.delete());    这个方法用于删除文件，这个文件也是必须存在
	}

}
