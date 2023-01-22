package com.simplilearn.accessmodifiers;

public class ProtectedAccessModifierConsumerExample {

	public static void main(String[] args) {
		
		ProtectedAccessModifierExample protectedClassObject = new ProtectedAccessModifierExample();
		
		System.out.println("Accessing the protected remainderOfNumbers function from within the same package but from the different class ......");
		
		protectedClassObject.remainderOfNumbers();

	}

}
