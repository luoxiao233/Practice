package com.zuikc.Exception;

public class Demo1_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo D = new Demo();
		int x =D.test(10,4);
		System.out.println(x);

	}

}
class Demo{
	public int test(int a,int b){
		return a / b;	
	}
}
