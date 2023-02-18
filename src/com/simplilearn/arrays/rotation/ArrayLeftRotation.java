package com.simplilearn.arrays.rotation;

public class ArrayLeftRotation {

	public static void main(String[] args) {
		
		int array[] = {11, 22, 33, 44, 55, 66, 77};
		
		// no of rotations
		//int r = 1;
		
		int n = array.length;
		
		System.out.println("Array before rotation:: ");
		
		for(int i = 0; i < n; i ++) {
			System.out.print(array[i] + " ");
		}
		
		//rotateArrayByOne(array, n);
		
		rotateByLeft(array, 1, n);
	
		System.out.println();
		
		System.out.println("Array after rotation:: ");
		
		for(int i = 0; i < n; i ++) {
			System.out.print(array[i] + " ");
		}
	}
	
	
	private static void rotateByLeft(int array[], int d, int n) {
		for(int i = 0; i < d; i++) {
			rotateArrayByOne(array, n);
		}
	}
	
	private static void rotateArrayByOne(int array[], int n) {
		
//		int i;
//		int temp;
		int i, temp;
		
		temp = array[0];
		
		for(i = 0; i < n - 1; i++) {
			// shifts each array element to the left by 1
			array[i] = array[i + 1];
		}
			array[i] = temp;
		
	}

}
