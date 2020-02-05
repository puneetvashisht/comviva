package com.viva.threadsdemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ConcurrencyDemo {
	
	public static void main(String[] args) {
		
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4,
                0L, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(4));
		
		Runnable r = new Runnable(){
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				
			}	
		};
		for(int i=0;i<180;i++){
			executor.submit(r);
		}
		
		executor.shutdown();
		
	}

}
