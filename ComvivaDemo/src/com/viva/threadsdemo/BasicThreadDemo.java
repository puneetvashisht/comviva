package com.viva.threadsdemo;



class SalaryTransferTask implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Running inside a thread: " + Thread.currentThread().getName());
	}
	
}

public class BasicThreadDemo {

	public static void main(String[] args) {
		
//		for(int i=0; i<10 ; i++){
			Thread t = new Thread(new SalaryTransferTask());
			t.start();
//		}
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		System.out.println("End of process: " + Thread.currentThread().getName());

	}

}
