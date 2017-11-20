package com.java.object;

import com.java.bean.Student;

public class Demo3_toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		System.out.println(stu.toString());   //如果不重写，那么返回的是对象的地制值
		
		//具体系统默认重写如下：
		/*@Override
		public String toString() {
			return "student [name=" + name + ", age=" + age + "]";
		}*/
	}

}
