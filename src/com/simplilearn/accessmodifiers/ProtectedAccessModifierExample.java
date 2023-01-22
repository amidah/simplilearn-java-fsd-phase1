package com.simplilearn.accessmodifiers;

public class ProtectedAccessModifierExample {

	public static void main(String[] args) {
		
		ProtectedAccessModifierExample protectedClassObject = new ProtectedAccessModifierExample();
		
		System.out.println("Accessing the protected remainderOfNumbers function from within the same package and within the same class ......");
		
		protectedClassObject.remainderOfNumbers();

	}
	
	// protected non-parameterized function
	protected void remainderOfNumbers() {
		
		long value1 = 20;
		long value2 = 10;
		
		System.out.println("The remainder of value1 and value2 is :: " + (value1 % value2));
		
	}

}
