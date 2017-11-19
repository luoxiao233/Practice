package com.zuikc.Exception;

public class Demo4_finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 d = new Demo4();
		System.out.println(d.method());

	}

}
class Demo4{
	public int method(){
		int x = 10;
		try {
			x = 20;
			System.out.println(1/0);
			return x;
		} catch (Exception e) {
			// TODO: handle exception
			x = 30;
			return x;
		}finally{
			x = 40;
		}
	}
}
