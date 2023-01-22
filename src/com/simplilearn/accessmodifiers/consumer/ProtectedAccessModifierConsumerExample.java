package com.simplilearn.accessmodifiers.consumer;

import com.simplilearn.accessmodifiers.ProtectedAccessModifierExample;

public class ProtectedAccessModifierConsumerExample extends ProtectedAccessModifierExample{

	public static void main(String[] args) {
		
		ProtectedAccessModifierConsumerExample protectedClassObject = new ProtectedAccessModifierConsumerExample();
		
		System.out.println("Accessing the protected remainderOfNumbers function from the different package only by extending the class in which the function is defined i.e. using inheritance oops concepts ......");
		
		protectedClassObject.remainderOfNumbers();

	}

}
