package com.java.jdk5;

import static java.util.Arrays.sort;
import static java.util.Arrays.toString;
public class Demo3_StaticImport extends Object{
	/*
	 * * A:��̬�������
		* B:��ʽ��
			* import static ������.����.������;
			* ����ֱ�ӵ��뵽�����ļ���
		* C:ע������
			* ���������Ǿ�̬��,����ж��ͬ���ľ�̬���������ײ�֪��ʹ��˭?���ʱ��Ҫʹ�ã������ǰ׺���ɴ˿ɼ������岻������һ�㲻�ã�����Ҫ�ܿ�����
			* jdk1.5�汾��Ψһ�ܱ���:��̬����
	 */
	public static void main(String[] args){
		int[] arr = {22,44,33,55,11};
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
