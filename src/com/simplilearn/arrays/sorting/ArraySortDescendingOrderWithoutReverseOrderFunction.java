package com.simplilearn.arrays.sorting;

public class ArraySortDescendingOrderWithoutReverseOrderFunction {

	public static void main(String[] args) {
		
		int array[] = {12, 10, 3, 6, 8, 1, 19, -12, -10, 20};
		
		int length = array.length;
		
		System.out.println("Array before sorting:: ");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		sortArrayDescOrder(array, length);
		
		System.out.println();
		
		System.out.println("Array after sorting:: ");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		printLargestNumbers(array, 3);

	}
	
	private static void sortArrayDescOrder(int array[], int n) {
		int temp;
		
		for(int i = 0; i < n; i++) {
			
			for(int j = i + 1; j < n; j++) {
				
				if(array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					
				}
				
				
				
			}
			
		}
		
	}
	
	private static void printLargestNumbers(int array[], int k) {
		
		System.out.println("Largest " + k + " values from the given array are:: ");
		for(int i = 0; i < k; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
