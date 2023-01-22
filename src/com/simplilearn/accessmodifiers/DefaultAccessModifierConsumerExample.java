package com.simplilearn.accessmodifiers;

public class DefaultAccessModifierConsumerExample {

	public static void main(String[] args) {
		
		DefaultAccessModifierExample defaultClassObject = new DefaultAccessModifierExample();
	
		System.out.println("Accessing the default divide numbers function from within the same package but from the different class .....");
		defaultClassObject.divideNumbers();
	
	}
	

}
