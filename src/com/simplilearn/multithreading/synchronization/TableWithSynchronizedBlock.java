package com.simplilearn.multithreading.synchronization;

public class TableWithSynchronizedBlock {

	void printTable(int n) {
		
		System.out.println("The thread coming to print table of " + n);
		
		synchronized (this) {
			for(int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
	
		}
	}
	
}
