package com.java.com;

public class Demo6_Ticket {
	/*
	 * ����:��·��Ʊ,һ��100��,ͨ���ĸ���������.
	 */
	public static void main(String[] args) {
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
	}

}
class Ticket extends Thread{
	private static int ticket = 100;
	
	public void run(){
		while(true){
			synchronized(Ticket.class){
				if (ticket <= 0) {
					break;
				}
				try {
					Thread.sleep(10); 
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(getName() + "���ڳ���" + ticket-- + "Ʊ");
		}
	}
}
