package com.java.buffer;

public class Demo2_Method {

	public static void main(String[] args) {
		/*
		 * StringBuffer����Ҫ���
		 */
//		demo1();
		StringBuffer sb = new StringBuffer();
		System.out.println(sb);    				// ������ʾΪ��
		StringBuffer sb1 = sb.append("hehe");
		System.out.println(sb1);				//hehe
		StringBuffer sb2 = sb.append(true);
		System.out.println(sb2);				//hehetrue
		StringBuffer sb3 = sb.append(100);
		System.out.println(sb3);				//hehetrue100
		
		System.out.println(sb); //heheture100
		System.out.println(sb1);//heheture100
		System.out.println(sb2);//heheture100
		System.out.println(sb3);//heheture100 
		//ԭ���ǻ�����ֻ��һ�������Խ��չ��̻����������յĽ����ֻ��һ����
	}

	static void demo1() {
		StringBuffer b = new StringBuffer();     //����һ��������
		StringBuffer b1 = b.append("woshizuile");  //��������ַ�
		b.insert(5, "zhende");  // ������5֮ǰ���������
		System.out.println(b);   //��ʾ��������
	}

}
