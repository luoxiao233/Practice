package com.java.exception;

public class Demo1_Exception {

	public static void main(String[] args) {
		Math m = new Math();
		try{
			System.out.println("�������" + m.div(10, 0));
		}catch(Exception e){          //�����쳣�Ĳ�׽
			System.out.println("�쳣��" + e);
		}
	}

}
class Math{
	public int div(int a,int b) throws Exception{
		System.out.println("���㿪ʼ");
		int temp = 0;
		try{
			temp = a / b;              //��������쳣����ô��ִ��catch
		}catch(Exception e){
			throw e;                  //���쳣 ���͸����ô�
		}finally {                //�����Ƿ����쳣����ִ����������
			System.out.println("�������");
		}
		return temp;
	}
}
