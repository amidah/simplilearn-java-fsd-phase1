package com.simplilearn.functions;

public class StudentMethodOverridingExample extends PersonMethodOverridingExample{
	
	
	public static void main(String[] args) {
		StudentMethodOverridingExample stud = new StudentMethodOverridingExample();
		stud.work();
	}

	//here we have created similar work function as that of Person's work function, so we are overriding the work function
	public void work() {
		System.out.println("The more you work towards your goal the early you will get the success...");
	}
}
