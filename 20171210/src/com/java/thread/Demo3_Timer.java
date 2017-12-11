package com.java.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


public class Demo3_Timer {

	public static void main(String[] args) throws Exception {
		Timer t = new Timer();
		t.schedule(new MyTimerTask(), new Date(117, 11, 11, 10, 58, 55),300);
		while(true){
			System.out.println(new Date());
			Thread.sleep(1000);
		}
//		for (int i = 10; i > 0; i--) {
//			System.out.println(i);
//			Thread.sleep(1000);
//		}
	}
}
class MyTimerTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("该做事了");
	}

}



