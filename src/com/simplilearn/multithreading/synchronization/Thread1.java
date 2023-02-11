package com.simplilearn.multithreading.synchronization;

public class Thread1 extends Thread{
	
	TableWithSynchronizedMethod t;
	TableWithSynchronizedBlock tb;
	
	Thread1(TableWithSynchronizedMethod t){
		this.t = t;
	}
	
	Thread1(TableWithSynchronizedBlock tb){
		this.tb = tb;
	}
	
//	public void run() {
//		t.printTable(5);
//	}
	
	public void run() {
		tb.printTable(5);
	}

}
