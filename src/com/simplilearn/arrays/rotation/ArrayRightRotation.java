package com.simplilearn.arrays.rotation;

public class ArrayRightRotation {

	public static void main(String[] args) {
		
		int[] array = {12, -9, 4, 2, -10, 11, 14};
		
		// no of rotations
		int r = 1;
		
		int n = array.length;
		
		System.out.println("Array before rotation:: ");
		
		for(int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}

		rotateByRight(array, 2, n);
		
		System.out.println();
		
		System.out.println("Array after right rotation:: ");
		
		for(int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	// this function rotates the array by d times
	private static void rotateByRight(int[] array, int d, int n) {
		
		for(int i = 0; i < d; i++) {
			rotateRightByOne(array, n);
		}
	}
	
	private static void rotateRightByOne(int[] array, int n) {
		
		int i, temp;
		
		temp = array[n - 1];
		
		for(i = n - 1; i > 0; i--) {
			array[i] = array[i - 1]; // a[6] = a[6 - 1]
		}
		
		array[0] = temp;
	
	}

}
