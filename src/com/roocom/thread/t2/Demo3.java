package com.roocom.thread.t2;

/**
 * ʹ�������ڲ��࣬�൱�ڼ̳�thread�ഴ���߳�
 * ʵ��runable�ӿڴ����߳�
 * @author kdliu
 *
 */
public class Demo3 {

	public static void main(String[] args) {
		//ʹ�������ڲ��࣬�൱�ڼ̳�thread��
//		new Thread() {
//			public void run() {
//				System.out.println("thread start...");
//			};
//		}.start();
		
		//ʵ��runable�ӿ�
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("thread start...");	
//			}
//		}).start();
		
		//ͬʱ�м̳�thread���ʵ��runable�Ľӿڵ��̣߳���ִ������ķ��������н����sub
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
