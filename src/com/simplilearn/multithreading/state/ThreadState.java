package com.simplilearn.multithreading.state;

public class ThreadState implements Runnable {

	public static Thread t1;
	public static ThreadState obj;
	
	public static void main(String[] args) {
		obj = new ThreadState();
		t1 = new Thread(obj);
		
		System.out.println("The state of thread t1 after spawning it - " + t1.getState());
		
		t1.start();
		
		System.out.println("The state of thread t1 after invoking the start() on it - " + t1.getState());
	}
	
	
	@Override
	public void run() {
		ABC abc = new ABC();
		Thread t2 = new Thread(abc);
		System.out.println("The state of thread t2 after spawning it - " + t2.getState());
		
		t2.start();
		
		
		System.out.println("The state of thread t2 after invoking the start() on it - " + t2.getState());
		
		try {
			// moving the thread t1 to the state timed waiting   
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("The state of thread t2 after after invoking the method sleep() on it - " + t2.getState());
	
		try {
			//waiting for t2 to complete its execution
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("The state of thread t2 when it has completed it's execution - " + t2.getState());
	
	}

}
