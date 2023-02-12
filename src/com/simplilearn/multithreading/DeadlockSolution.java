package com.simplilearn.multithreading;

public class DeadlockSolution {

	public static void main(String[] args) {
		
		DeadlockSolution dls = new DeadlockSolution();
		final resource1 rs1 = dls.new resource1();
		final resource2 rs2 = dls.new resource2();
		
		final String s1 = "john";
		final String s2 = "sam";
		
		Runnable r1 = new Runnable() {
	
			public void run() {
				synchronized (s2) {
					try {
						// Adding delay so that both the threads can start trying to lock the resources
						Thread.sleep(100);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
					
					synchronized (s1) {
						System.out.println("Thread 1 : Inside First Synchronization Block");
					}
				}
				
			}
		};
		
		
		Runnable r2 = new Runnable() {
			
			public void run() {
				synchronized (s2) {
					
					synchronized (s1) {
						System.out.println("Thread 2 : Inside Second Synchronization Block");
					}
				}
				
			}
		};
		
		new Thread(r1).start();
		new Thread(r2).start();
System.out.println("111");
	    System.out.flush(); 
	
	}
	
private class resource1 {
	private int i = 10;
	
	public int getI() {
		return i;
	}
	
	public void set(int i) {
		this.i = i;
	}
}

private class resource2 {
	
private int i = 20;
	
	public int getI() {
		return i;
	}
	
	public void set(int i) {
		this.i = i;
	}
}

}


