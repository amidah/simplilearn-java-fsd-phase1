package com.simplilearn.multithreading;

public class ThreadClass extends Thread {
	
	// here we have overriden the run method which is already present in java internal Thread Class
	public void run() {
		System.out.println("My thread is running ....");
	}

}
