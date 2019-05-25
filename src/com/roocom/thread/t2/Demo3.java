package com.roocom.thread.t2;

/**
 * 使用匿名内部类，相当于继承thread类创建线程
 * 实现runable接口创建线程
 * @author kdliu
 *
 */
public class Demo3 {

	public static void main(String[] args) {
		//使用匿名内部类，相当于继承thread类
//		new Thread() {
//			public void run() {
//				System.out.println("thread start...");
//			};
//		}.start();
		
		//实现runable接口
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("thread start...");	
//			}
//		}).start();
		
		//同时有继承thread类和实现runable的接口的线程，是执行子类的方法；运行结果：sub
		new Thread(new Runnable() {
			public void run() {
				System.out.println("runnable");
			}
		}) {
			public void run() {
				System.out.println("sub");
			};
		}.start();
	}
}
