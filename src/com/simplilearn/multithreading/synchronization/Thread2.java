package com.simplilearn.multithreading.synchronization;

public class Thread2 extends Thread{

	TableWithSynchronizedMethod t;
	TableWithSynchronizedBlock tb;
	
	Thread2(TableWithSynchronizedMethod t){
		this.t = t;
	}
	
	Thread2(TableWithSynchronizedBlock tb){
		this.tb = tb;
	}
	
//	public void run() {
//		t.printTable(100);
//	}
	
	public void run() {
		tb.printTable(100);
	}
}
