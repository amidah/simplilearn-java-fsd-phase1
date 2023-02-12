package com.simplilearn.exception.handling;

public class InvalidAgeExample {

	public static void main(String[] args) {
		Person p1 = new Person("John", 20, "Male");
		Person p2 = new Person("Sam", 17, "Male");
		
		try {
			validateAgeForVoting(p1.getAge());
			validateAgeForVoting(p2.getAge());
		}
		catch(InvalidAgeException iae) {
			System.out.println("Exception Ocurred:: " + iae);
		}
	}
	
	
	static void validateAgeForVoting(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("invalid age for voting");
		}
		System.out.println("Age is valid!");
	}
}
