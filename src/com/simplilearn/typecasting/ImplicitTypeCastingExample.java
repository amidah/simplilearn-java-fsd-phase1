package com.simplilearn.typecasting;

import java.util.Scanner;

public class ImplicitTypeCastingExample {

	public static void main(String[] args) {
	
		// 1. Implicit Type Casting or Widening 
		// (byte -> short -> int -> long -> float -> double)
		
		System.out.println("=====================");
		System.out.println("Implicit Type Casting");
		System.out.println("=====================");
		
		System.out.println("Please enter any number:: ");
		
		Scanner byteInput = new Scanner(System.in);
		
		byte byteValue = byteInput.nextByte();
		
		System.out.println("Byte Value taken in input from console :: " + byteValue);
		
		short shortValue = byteValue;
		
		int intValue = shortValue;
		
		long longValue = intValue;
		
		float floatValue = longValue;
		
		double doubleValue = floatValue;
		
		System.out.println("Value after implicit type casting to short :: " + shortValue);
		System.out.println("Value after implicit type casting to int :: " + intValue);
		System.out.println("Value after implicit type casting to long :: " + longValue);
		System.out.println("Value after implicit type casting to float :: " + floatValue);
		System.out.println("Value after implicit type casting to double :: " + doubleValue);		
		
	}

}
