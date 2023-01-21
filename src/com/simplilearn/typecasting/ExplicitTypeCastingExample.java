package com.simplilearn.typecasting;

import java.util.Scanner;

public class ExplicitTypeCastingExample {

	public static void main(String[] args) {
		
		// 2. Explicit Type Casting or Narrowing
	    // double -> float -> long -> int -> short -> byte
		
		System.out.println("=====================");
		System.out.println("Explicit Type Casting");
		System.out.println("=====================");
		
		System.out.println("Please enter any number:: ");
		
		Scanner doubleInput = new Scanner(System.in);
		
		double doubleValue = doubleInput.nextDouble();
		
		System.out.println("Double Value taken in input before Explicit Type Casting from console :: " + doubleValue + " and its data type is :: " + ((Object)doubleValue).getClass().getSimpleName());
				
		float floatValue = (float)doubleValue;
		long longValue = (long)floatValue;
		int intValue = (int)longValue;
		short shortValue = (short)intValue;
		byte byteValue = (byte)shortValue;
		
		System.out.println("Value after explicit type casting to float :: " + floatValue + " and its data type is :: " + ((Object)floatValue).getClass().getSimpleName());
		System.out.println("Value after explicit type casting to long :: " + longValue + " and its data type is :: " + ((Object)longValue).getClass().getSimpleName());
		System.out.println("Value after explicit type casting to int :: " + intValue + " and its data type is :: " + ((Object)intValue).getClass().getSimpleName());
		System.out.println("Value after explicit type casting to short :: " + shortValue + " and its data type is :: " + ((Object)shortValue).getClass().getSimpleName());
		System.out.println("Value after explicit type casting to byte :: " + byteValue + " and its data type is :: " + ((Object)byteValue).getClass().getSimpleName());
		
		
		
		
		
		
		
		
	}

}
