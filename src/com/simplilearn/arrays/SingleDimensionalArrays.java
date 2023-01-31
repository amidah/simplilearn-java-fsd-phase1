package com.simplilearn.arrays;

public class SingleDimensionalArrays {

	public static void main(String[] args) {
		
		// Let us create few fixed length single dimensional arrays
		
		// datatype name[] = new datatype[size];
		// datatype[] name = new datatype[size];
		// datatype []name = new datatype[size];
		// datatype name[] = {values};
		// datatype[] name = {values};
		// datatype []name = {values};

		int []integerArray = new int[5]; // declared and instantiated an array of type int
		int intArray[] = {10, 20, 30, 40, 50}; // declaration, instantiation and initialization
		// let us initialize the array
		integerArray[0] = 80;
		integerArray[1] = 90;
		integerArray[2] = 100;
		integerArray[3] = 70;
		integerArray[4] = 60;
		
		
		System.out.println("The Integer Array length is:: " + integerArray.length);
		System.out.println("The Integer Array Values are:: [" + integerArray[0] + ", " + integerArray[1] + ", " + integerArray[2] + ", " + integerArray[3] + ", " + integerArray[4] + "]");
		
		System.out.println("The Int Array length is:: " + intArray.length);
		System.out.println("The Int Array Values are:: [" + intArray[0] + ", " + intArray[1] + ", " + intArray[2] + ", " + intArray[3] + ", " + intArray[4] + "]");
		
		// traversing an integer array
		System.out.println("Traversing the Integer Array Values using For Loop::");
		for(int i = 0; i < integerArray.length; i++) {
			System.out.println(integerArray[i]);
		}
		
		// String type array
		// datatype name[] = new datatype[size];
		String stringArray[] = new String[3];
		stringArray[0] = "Mohandas";
		stringArray[1] = "Karamchand";
		stringArray[2] = "Gandhi";
		
		System.out.println("The String Array length is:: " + stringArray.length);
		System.out.println("The Full Name of M.K. Gandhi is:: " + stringArray[0] + " " + stringArray[1] + " " + stringArray[2]);
	}

}
