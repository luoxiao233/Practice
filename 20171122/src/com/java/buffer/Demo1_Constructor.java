package com.java.buffer;

public class Demo1_Constructor {

	public static void main(String[] args) {
		/*
		 * StringBuffer�򵥵�˵����һ���̰߳�ȫ�Ŀɱ��ַ����У�������String��һ�������������ǲ�����+��ƴ�ӣ�
		 */
		
		
//		Demo1();
		StringBuffer b = new StringBuffer();
		b.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println(b.capacity());  //�������Ϊ0-16֮�䣬��ô����Ϊ16�������16-34������Ϊ34�����>34,��ô����Ϊ���ٳ��Ⱦ��Ƕ���
		System.out.println(b.length()); //����Ϊ33  ��Ϊ��33��a
	}

	static void Demo1() {
		StringBuffer b = new StringBuffer();   
		System.out.println(b.capacity());//Ĭ�ϵ��ַ�����������Ϊ16��ָ0-15��
		System.out.println(b.length());   //�ַ����������еĳ���Ϊ0����Ϊ���޲ι��췽����
		b.append("aaaaaaaaaaaaaaaa");      //���ַ����������16���ַ�
		System.out.println(b.capacity());  //��������16  --��Ϊ���16���ַ�û�г���16
		System.out.println(b.length());  //16   ���ȼ���Ϊ��16
		b.append("aaaaaaaaaaaaaaaaa");   //���� �ַ������� ���17���ַ�
		System.out.println(b.capacity()); //������Ϊ��34
		System.out.println(b.length());  //����Ϊ34   16+17
	}
}
