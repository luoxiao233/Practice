package com.java.chario;

public class Demo5_Warp {

	public static void main(String[] args) {
		niu q = new niu(new Student());
		q.code();
	}
}

interface Coder{
	public void code();
}
class Student implements Coder{

	@Override
	public void code() {
		System.out.println("什么都不会");
	}
}
class niu implements Coder{
	private Student s;
	public niu(Student s){
		this.s = s;
	}
	@Override
	public void code() {
		s.code();
		System.out.println("会了好多");
		System.out.println("oooo");
	}
	
}
