package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({ "rawtypes", "unchecked" })  // 这是用快捷键Ctrl+1来添加的
public class Demo2_Collection {
	/*
	 * * A:案例演示	
			基本功能演示
			boolean add(E e)			添加		:add方法底层返回的是true:如果实现的是List的子类,就没有必要写返回值类型了,因为都是true
			boolean remove(Object o)	删除
			void clear()				清空
			boolean contains(Object o)  是否包含
			boolean isEmpty()			是否为空
			int size()					集合长度
		B: 注解(简单了解:扫黄) ctrl + 1
	 */
	public static void main(String[] args) {
//		demo1();
		Collection c = new ArrayList();
		c.add("a");      
		c.add("b");
		c.add("b");
		c.add("d");      //按顺序往里面添加
		
//		System.out.println(c);
//		boolean b = c.remove("b");   //删除b
//		System.out.println(b);    //确认已经删除 
//		System.out.println(c);   //再次查看
		
		boolean b2 = c.contains("c");
		System.out.println(b2); //判断是否包含
		
		
	}

	static void demo1() {
		//Collection c = new Collection();    不能这样创建
		Collection c = new ArrayList();    //父类引用子类对象
		boolean b1 = c.add("abc");   //存入必须是布尔型。 用list这种可以前面可以不写boolean
		System.out.println(b1);
		System.out.println(c);
		boolean b2 = c.add(true);
		System.out.println(b2);
		System.out.println(c);
	}

}
