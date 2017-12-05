package com.java.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("reverse.txt"));
		ArrayList<String> l = new ArrayList<>();
		String line;
		while((line = br.readLine()) != null){
			l.add(line);
		}
		for (int i = l.size() - 1; i >= 0; i--) {
			bw.write(l.get(i));
			bw.newLine();
		}
		br.close();
		bw.close();
	}

}
