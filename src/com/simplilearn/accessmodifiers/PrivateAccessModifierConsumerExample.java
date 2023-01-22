package com.simplilearn.accessmodifiers;

public class PrivateAccessModifierConsumerExample extends PrivateAccessModifierExample{

	public static void main(String[] args) {
	
		PrivateAccessModifierExample privateObject = new PrivateAccessModifierExample();
		
		PrivateAccessModifierConsumerExample privateConsumerObject = new PrivateAccessModifierConsumerExample();

		System.out.println("Accessing the private checkEqualityBetweenNos function from within the same package but from the different class is not possible.....");
		
		System.out.println("Even if we extends the PrivateAccessModifierExample class then also we can't use any private property of the parent PrivateAccessModifierExample class...");
		
		//privateConsumerObject.checkEqualityBetweenNos();
		//privateObject.checkEqualityBetweenNos();
	}

}
