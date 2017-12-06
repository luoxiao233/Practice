package com.java.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class Test1 {
/*
 * ��ȡһ���ı����ַ����ֵĴ���,���Ѷ�Ӧ�Ĵ������뵽����һ���ı���
 * �뷨��
 * ��Ҫ�ľ�����Ҫ��ȡ���ַ�  ����
 * �ַ��������Ӧ����ôʹ��TreeMap   ���һ���������
 *  ����
 *  ����  
 *  �����������  ����������д��һ���ļ���ȥ
 *  ����
 */
	public static void main(String[] args) throws IOException {
//		demo1();
		
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		TreeMap<Character, Integer> map = new TreeMap<>();    //˫�п����򼯺ϣ� HashMap��������
		int ch;
		while((ch = br.read()) != -1){
			char c = (char)ch;
			/*if (!map.containsKey(c)) {
				map.put(c, 1);
			}else{
				map.put(c, map.get(c) + 1);
			}*/
			map.put(c, !map.containsKey(c) ? 1 : map.get(c) + 1);
		}
		br.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter("times.txt"));
		for (Character key : map.keySet()) {
			switch (key) {
			case '\t':
				bw.write("\\t" + "=" + map.get(key));
				break;
			case '\r':
				bw.write("\\r" + "=" + map.get(key));
				break;
			case '\n':
				bw.write("\\n" + "=" + map.get(key));
				break;
			case ' ':
				bw.write("�ո�" + "=" + map.get(key));
				break;

			default:
				bw.write(key + "=" + map.get(key));
				break;
			}
			bw.newLine();
		}
		bw.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		TreeMap<Character, Integer> tm = new TreeMap<>();
		int c;
		while((c = br.read()) != -1){
			char ch = (char)c;
			if (!tm.containsKey(ch)) {
				tm.put(ch, 1);
			}else{
				tm.put(ch, tm.get(ch) + 1);
			}
		}
		br.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter("ttt.txt"));
		for (Character key : tm.keySet()) {
			bw.write(key +  "=" + tm.get(key));
			bw.newLine();
		}
		bw.close();
	}

}
