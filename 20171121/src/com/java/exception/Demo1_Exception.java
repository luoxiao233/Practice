package com.java.exception;

public class Demo1_Exception {

	public static void main(String[] args) {
		Math m = new Math();
		try{
			System.out.println("这个除法" + m.div(10, 0));
		}catch(Exception e){          //进行异常的捕捉
			System.out.println("异常：" + e);
		}
	}

}
class Math{
	public int div(int a,int b) throws Exception{
		System.out.println("计算开始");
		int temp = 0;
		try{
			temp = a / b;              //如果产生异常，那么就执行catch
		}catch(Exception e){
			throw e;                  //把异常 抛送给调用处
		}finally {                //不管是否发生异常都会执行这个代码块
			System.out.println("计算结束");
		}
		return temp;
	}
}
