package com.roocom.thread.t2;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;

/**
 * 线程池的实现
 * @author kdliu
 *
 */
public class Demo6 {

	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newCachedThreadPool();
		for (int i = 0; i < 1000; i++) {
			threadPool.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName());
					
				}
			});
		}
		
		threadPool.shutdown();
	
	}
}
