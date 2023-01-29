package com.simplilearn.functions;

public class EmployeeMethodOverridingExample extends PersonMethodOverridingExample{

	// We haven't created any work function over here so we are only using Person's work method
	public static void main(String[] args) {
		EmployeeMethodOverridingExample emp = new EmployeeMethodOverridingExample();
		emp.work();
	}
}
