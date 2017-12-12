package com.java.reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
/*
 * (Class.forName()��ȡ�����ļ�(xxx.priperties)����)
	* ե֭��(Juicer)ե֭�İ���
	* �ֱ���ˮ��(Fruit) ƻ��(Apple) ����(Orange) ե֭(squeeze)
 */
public class Demo2_Reflect {

	public static void main(String[] args) throws Exception {
		Juicer j = new Juicer();
		BufferedReader br = new BufferedReader(new FileReader("xxx.properties"));
		Class clazz = Class.forName(br.readLine());
		Fruit f = (Fruit)clazz.newInstance();
		j.squeeze(f);
	}

}
interface Fruit{
	public void squzzez();
}
class Apple implements Fruit{

	@Override
	public void squzzez() {
		System.out.println("��ƻ��֭");
	}
	
}
class Orange implements Fruit{

	@Override
	public void squzzez() {
		System.out.println("������֭");
	}
	
}
class Juicer{
	public void squeeze(Fruit f){
		f.squzzez();
	}
}
