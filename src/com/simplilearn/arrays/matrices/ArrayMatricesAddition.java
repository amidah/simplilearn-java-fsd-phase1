package com.simplilearn.arrays.matrices;

public class ArrayMatricesAddition {

	public static void main(String[] args) {
		int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		int b[][] = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};
		
		int [][] c = new int[3][3];
		
		System.out.println("Addition:: ");
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("Subtraction:: ");
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] - b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("Multiplication:: ");
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] * b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("Division:: ");
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] / b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
			
		}
	}

}
