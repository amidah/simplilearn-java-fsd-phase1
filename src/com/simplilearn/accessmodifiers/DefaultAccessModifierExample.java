package com.simplilearn.accessmodifiers;

public class DefaultAccessModifierExample {

	public static void main(String[] args) {
		
		DefaultAccessModifierExample defaultClassObject = new DefaultAccessModifierExample();
	
		System.out.println("Accessing the default divide numbers function from within the same package and the same class .....");
		defaultClassObject.divideNumbers();
	
	}
	
	// default non-parameterized function
	void divideNumbers() {
		
		int value1 = 10;
		int value2 = 2;
		
		System.out.println("The division of value1 and value2 is :: " + (value1/value2));
	}

}
