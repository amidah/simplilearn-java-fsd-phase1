package com.simplilearn.multithreading;

public class Deadlock {

	public static void main(String[] args) {
		final String s1 = "Harry Potter";
		final String s2 = "Jerry Potter";
		
		// thread t1 tries to lock s1 then s2
		Thread t1 = new Thread() {
			public void run() {
				synchronized (s1) {
					System.out.println("Thread 1 : locked object s1");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					synchronized (s2) {
						System.out.println("Thread 1 : locked object s2");
					}
				}
			}
		};
		
		// thread t2 tries to lock s2 then s1
		Thread t2 = new Thread() {
			public void run() {
				synchronized (s2) {
					System.out.println("Thread 2 : locked object s2");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					synchronized (s1) {
						System.out.println("Thread 2 : locked object s1");
					}
				}
			}
		};
		
		t1.start();
		t2.start();
	
	}
}
