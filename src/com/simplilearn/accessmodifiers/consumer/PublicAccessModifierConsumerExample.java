package com.simplilearn.accessmodifiers.consumer;

import com.simplilearn.accessmodifiers.PublicAccessModifierExample;

public class PublicAccessModifierConsumerExample {

	
	public static void main(String[] args) {
		
		System.out.println("Calling multipluNumbers function from outside the package...");
		// Object creation using default constructor
		PublicAccessModifierExample pame = new PublicAccessModifierExample();
        // calling a method using class object pame
		pame.multiplyNumbers();
	}
}
