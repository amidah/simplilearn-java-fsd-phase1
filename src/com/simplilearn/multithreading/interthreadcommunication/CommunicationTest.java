package com.simplilearn.multithreading.interthreadcommunication;

public class CommunicationTest {

	int amount  = 1000;
	
	public synchronized void withdraw(int amt) {
		System.out.println("going to withdraw amount- " + amt);
		
		if(amount < amt) {
			System.out.println("Less Balance, waiting for deposit...");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
			amount -= amt;
			//this.amount = this.amount - amt;
			System.out.println("Amount of Rs" + amt + " is withdrawn.. and left amount is " + this.amount);
		}
		
	public synchronized void deposit(int amount) {
		System.out.println("Going to deposit amount- " + amount);
		
		this.amount += amount;
		
		System.out.println("Total Amount after deposit is " + amount);
		
		notify();
	}
	
	}
	

