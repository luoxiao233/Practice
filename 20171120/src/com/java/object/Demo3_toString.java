package com.java.object;

import com.java.bean.Student;

public class Demo3_toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		System.out.println(stu.toString());   //�������д����ô���ص��Ƕ���ĵ���ֵ
		
		//����ϵͳĬ����д���£�
		/*@Override
		public String toString() {
			return "student [name=" + name + ", age=" + age + "]";
		}*/
	}

}
