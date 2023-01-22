package com.simplilearn.defaultvariablevalues;

public class DefaultVariableValues {

	static int intValue;
	
	static byte byteValue;
	
	static short shortValue;
	
	static long longValue;
	
	double doubleValue;
	
	float floatValue;
	
	String stringValue;
	
	
	public static void main(String[] args) {
		
		DefaultVariableValues.printStaticDefaultValues();
		
		DefaultVariableValues defaultObject = new DefaultVariableValues();
		defaultObject.printDefaultValues();
	}
	
	// static public non-parameterized function
	public static void printStaticDefaultValues() {
		System.out.println("The default value of integer variable is:: " + intValue);
		System.out.println("The default value of byte variable is:: " + byteValue);
		System.out.println("The default value of short variable is:: " + shortValue);
		System.out.println("The default value of long variable is:: " + longValue);
		
		
	}
	
	// non-static public non-parameterized function
	public void printDefaultValues() {
		
		System.out.println("The default value of double variable is:: " + doubleValue);
		System.out.println("The default value of float variable is:: " + floatValue);
		System.out.println("The default value of string variable is:: " + stringValue);
		
	} 


}
