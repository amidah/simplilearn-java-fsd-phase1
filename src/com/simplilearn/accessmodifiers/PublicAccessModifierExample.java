package com.simplilearn.accessmodifiers;

public class PublicAccessModifierExample {


	// public access modifiers can provide the accessibility level inside the class, 
	// outside the class to other classes in the same package or to other packages as well
	// it is the highest level of accessibility in java
	
	// variables, methods, constructors
	
	// constructors can be default or non-parameterized or they can be parameterized constructors
	
	public static void main(String[] args) {
		
		String stringArgs = args[0];
		
		System.out.println("The first arg values passed from PublicAccessModifierConsumer Class is :: " + stringArgs);
		
		int value1 = 10;
		int value2 = 20;
		
		System.out.println("The sum of value1 and value2 is :: " + (value1 + value2));
		
		System.out.println("Calling multipluNumbers function from within the package within the same class...");
		// Object creation using default constructor
		PublicAccessModifierExample pame = new PublicAccessModifierExample();
		// calling a method using class object pame
		pame.multiplyNumbers();
		
	}
	
	// Non parameterized public function
	public void multiplyNumbers() {
		// local scoped variables, only visible inside the method not outside the method
		int value1 = 20;
		int value2 = 30;
		
		System.out.println("The multiplication of value1 and value2 is :: " + (value1 * value2));
	}
	
}
