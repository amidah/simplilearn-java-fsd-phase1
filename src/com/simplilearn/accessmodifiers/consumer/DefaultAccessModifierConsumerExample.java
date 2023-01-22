package com.simplilearn.accessmodifiers.consumer;

import com.simplilearn.accessmodifiers.DefaultAccessModifierExample;

public class DefaultAccessModifierConsumerExample {

	public static void main(String[] args) {
		
		DefaultAccessModifierExample defaultClassObject = new DefaultAccessModifierExample();
	
		System.out.println("Accessing the default divide numbers function from outside the same package is not possible as the default visibility is within the package only.....");
		
		//defaultClassObject.divideNumbers();
	
	}
	

}
