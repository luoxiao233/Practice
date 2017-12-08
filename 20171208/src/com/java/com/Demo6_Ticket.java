package com.java.com;

public class Demo6_Ticket {
	/*
	 * 需求:铁路售票,一共100张,通过四个窗口卖完.
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
			System.out.println(getName() + "正在出售" + ticket-- + "票");
		}
	}
}
