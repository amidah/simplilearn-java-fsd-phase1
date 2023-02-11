package com.simplilearn.multithreading.synchronization;

public class Synchronization {

	public static void main(String[] args) {
		//TableWithSynchronizedMethod obj = new TableWithSynchronizedMethod();
		TableWithSynchronizedBlock obj = new TableWithSynchronizedBlock();
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		
		t1.start();
		t2.start();

	}

}
