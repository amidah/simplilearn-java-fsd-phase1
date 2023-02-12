package com.simplilearn.multithreading.interthreadcommunication;

public class InterThreadCommunication {
	
	public static void main(String[] args) {
		final CommunicationTest ct = new CommunicationTest();
		
		Thread th1 = new Thread() {
			public void run() {
				ct.withdraw(2000);
			}
		};
		
		th1.start();
		
		Thread th2 = new Thread() {
			public void run() {
				ct.deposit(2000);
			}
		};
		
		
		th2.start();
		
	}

}
