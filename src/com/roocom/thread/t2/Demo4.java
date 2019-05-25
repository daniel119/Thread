package com.roocom.thread.t2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * ����������ֵ�Ϳ������쳣���߳�
 * @author kdliu
 *
 */
public class Demo4 implements Callable<Integer> {

	public static void main(String[] args) throws Exception {
		Demo4 d = new Demo4();
		FutureTask<Integer> task = new FutureTask<Integer>(d);
		Thread t = new Thread(task);
		t.start();
		System.out.println("���ȸɵ��ġ�������");
		Integer result = task.get();
		System.out.println("�߳�ִ�н��Ϊ��"+result);
	}

	@Override
	public Integer call() throws Exception {
		System.out.println("���ڽ��н��ŵļ��㡣����");
		Thread.sleep(3000);
		return 1;
	}
	
}
