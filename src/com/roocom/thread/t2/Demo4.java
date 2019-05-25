package com.roocom.thread.t2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建带返回值和可以抛异常的线程
 * @author kdliu
 *
 */
public class Demo4 implements Callable<Integer> {

	public static void main(String[] args) throws Exception {
		Demo4 d = new Demo4();
		FutureTask<Integer> task = new FutureTask<Integer>(d);
		Thread t = new Thread(task);
		t.start();
		System.out.println("我先干点别的。。。。");
		Integer result = task.get();
		System.out.println("线程执行结果为："+result);
	}

	@Override
	public Integer call() throws Exception {
		System.out.println("正在进行紧张的计算。。。");
		Thread.sleep(3000);
		return 1;
	}
	
}
