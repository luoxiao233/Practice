package com.java.reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
/*
 * (Class.forName()读取配置文件(xxx.priperties)举例)
	* 榨汁机(Juicer)榨汁的案例
	* 分别有水果(Fruit) 苹果(Apple) 桔子(Orange) 榨汁(squeeze)
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
		System.out.println("和苹果汁");
	}
	
}
class Orange implements Fruit{

	@Override
	public void squzzez() {
		System.out.println("和橘子汁");
	}
	
}
class Juicer{
	public void squeeze(Fruit f){
		f.squzzez();
	}
}
