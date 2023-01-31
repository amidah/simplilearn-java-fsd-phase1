package com.simplilearn.arrays;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		
		// Syntaxes for multidimensional arrays
		// dataType[][] arrayRefVar = new dataType[row size][column size];  
		// dataType [][]arrayRefVar = new dataType[row size][column size];   
		// dataType arrayRefVar[][] = new dataType[row size][column size];  
		// dataType []arrayRefVar[] = new dataType[row size][column size]; 
		
		int[][] intMultiDimArray = new int[3][3]; // decalration and instantiation
		
		// Let us initialize the values
		// ROW 1
		intMultiDimArray[0][0] = 20;
		intMultiDimArray[0][1] = 30;
		intMultiDimArray[0][2] = 40;
		
		// ROW 2
		intMultiDimArray[1][0] = 10;
		intMultiDimArray[1][1] = 50;
		intMultiDimArray[1][2] = 60;
		
		// ROW 3
		intMultiDimArray[2][0] = 70;
		intMultiDimArray[2][1] = 80;
		intMultiDimArray[2][2] = 90;
		
		System.out.println("The length of multidimensional array is :: " + intMultiDimArray.length);
		// Lets use for loop to print all the values
		System.out.println("The multidimensional array  values are::");
//		for(int i = 0; i < 3; i++) {
//			System.out.println("Row " + i + ": ");
//			for(int j = 0; j < 3; j++) {
//				System.out.println("Column " + j + ": " + intMultiDimArray[i][j] + " ");
//			}
//			System.out.println();
//		}
	
		
		for(int i = 0; i < 3; i++) {

			for(int j = 0; j < 3; j++) {
				System.out.print(intMultiDimArray[i][j] + " ");
			}
			System.out.println();
		}
		
		
		int[][] integerMultiDimArray = new int[3][2];
		
		System.out.println("integerMultiDimArray length is:: " + integerMultiDimArray.length);
		
		

	}

}
