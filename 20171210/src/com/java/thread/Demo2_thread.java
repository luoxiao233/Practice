package com.java.thread;

import java.io.IOException;

public class Demo2_thread {

	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
//		r.exec("shutdown -s -t 300");
		r.exec("shutdown -a");
	}

}
