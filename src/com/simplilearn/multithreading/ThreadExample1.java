package com.simplilearn.multithreading;

public class ThreadExample1 {

	public static void main(String[] args) {
		
		System.out.println("Here we are using thread created by extending Thread class..");
		ThreadClass threadClass = new ThreadClass();
		threadClass.start();
		
		System.out.println("Here we are using thread created by implementing Runnable interface..");
		RunnableClass runnableClass = new RunnableClass();
		Thread thread = new Thread(runnableClass);
		
		thread.start();

	}

}
