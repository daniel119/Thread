package com.roocom.thread.t2;

/**
 * 线程的创建，中断和销毁
 * @author kdliu
 *
 */
public class Demo1 extends Thread {

	public Demo1() {
	} 
	
	public Demo1(String name) {
		super(name);
	}
	@Override
	public void run() {
		while(!interrupted()) {
			System.out.println(getName()+"线程执行了！");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Demo1 d1 = new Demo1("first-thread");
		Demo1 d2 = new Demo1("second-thread");
		
//		//守护线程	
//		d1.setDaemon(true);
//		d2.setDaemon(true);
		
		d1.start();
		d2.start();
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//线程中断
		d1.interrupt();
		
	}

}
