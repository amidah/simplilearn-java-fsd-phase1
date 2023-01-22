package com.simplilearn.accessmodifiers;

public class PublicAccessModifierConsumerExample {

	
	public static void main(String[] args) {
		
		System.out.println("Calling multipluNumbers function from within the package but from another class...");
		// Object creation using default constructor
		PublicAccessModifierExample pame = new PublicAccessModifierExample();
        // calling a method using class object pame
		pame.multiplyNumbers();
		   
		String[] stringArgs = {"a", "b", "c"};
		// calling main function of PublicAccessModifierExample
		PublicAccessModifierExample.main(stringArgs);
		
	}
}
