package com.simplilearn.multithreading;

public class ThreadPriority {

	public static void main(String[] args) {
		Thread th1 = new Thread() {
			public void run() {
				System.out.println("Inside th1 run");
			}
		};
		
		Thread th2 = new Thread() {
			public void run() {
				System.out.println("Inside th2 run");
			}
		};
		
		Thread th3 = new Thread() {
			public void run() {
				System.out.println("Inside th3 run");
			}
		};
		
		System.out.println("Th1 priority : " + th1.getPriority());
		
		System.out.println("Th2 priority : " + th2.getPriority());
		
		System.out.println("Th3 priority : " + th3.getPriority());
		
		th1.setPriority(6);
		th2.setPriority(3);
		th3.setPriority(9);
		
		System.out.println("Th1 priority : " + th1.getPriority());
		
		System.out.println("Th2 priority : " + th2.getPriority());
		
		System.out.println("Th3 priority : " + th3.getPriority());
		

		
	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getPriority());
	}

}
