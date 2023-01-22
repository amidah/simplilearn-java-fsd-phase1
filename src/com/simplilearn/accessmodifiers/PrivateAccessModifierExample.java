package com.simplilearn.accessmodifiers;

public class PrivateAccessModifierExample {

	public static void main(String[] args) {
	
		PrivateAccessModifierExample privateObject = new PrivateAccessModifierExample();

		System.out.println("Accessing the private checkEqualityBetweenNos function from within the same package and the same class .....");
		privateObject.checkEqualityBetweenNos();
	}
	
	
	// private non-parameterized function
	private void checkEqualityBetweenNos() {
		
		String value1 = "John";
		String value2 = "John";
		
		System.out.println("value1 is equals to value2? " + (value1 == value2));
		
	}
	

}
