package com.simplilearn.arrays.sorting;

public class ArraySortAscendingOrderWithoutSortMethod {

	public static void main(String[] args) {
		
		int array[] = {12, 10, 3, 6, 8, 1, 19, -12, -10, 20};
		
		int length = array.length;
		
		System.out.println("Array before sorting:: ");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		sortArray(array, length);
	
		System.out.println();
		
		System.out.println("Array after sorting:: ");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	private static void sortArray(int array[], int n) {
		
		for(int i = 1; i < n; i++) {
			int j = i;
			int a = array[i];
			
			while((j > 0) && (array[j - 1] > a)){
				array[j] = array[j - 1];
				j--;
			}
			array[j] = a;	
		}	
	}

}
