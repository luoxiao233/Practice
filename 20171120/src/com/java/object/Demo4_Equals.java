package com.java.object;

import com.java.bean.Student;

public class Demo4_Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("张三",23);
		Student s2 = new Student("张三",23);
		System.out.println(s1.equals(s2));     //直接从字面上来判断两个是否相等（无关对象的地址，只凭内容）
	}

}
